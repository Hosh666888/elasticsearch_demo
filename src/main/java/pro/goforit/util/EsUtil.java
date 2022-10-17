package pro.goforit.util;

import pro.goforit.generator.mapper.ArticleMapper;
import lombok.extern.slf4j.Slf4j;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightBuilder;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.SearchHit;

import javax.annotation.Resource;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2022/10/13 16:06
 * @desc:
 **/
@Slf4j
public class EsUtil {

    @Resource
    private ArticleMapper articleMapper;
    @Resource
    private ElasticsearchRestTemplate elasticsearchRestTemplate;

    private static final String HINT_PRE_H5 = "<strong style=\"color:red;\">";
    private static final String HINT_POST_H5 = "</strong>";

    private static Integer NUM_OF_FRAGMENT_DEFAULT = 0;
    private static Integer FRAGMENT_SIZE_DEFAULT = 8000;

    /**
     *
     * @param fields           高亮字段
     * @param numOfFragments  下面这两项,如果你要高亮如文字内容等有很多字的字段,必须配置,不然会导致高亮不全,文章内容缺失等
     * @param fragmentSize    文本块大小
     * @param requireFieldMatch  如果要多个字段高亮,这项要为false
     * @return
     */
    public static HighlightBuilder getHighlightBuilder(Collection<String> fields,Integer numOfFragments,Integer fragmentSize,boolean requireFieldMatch){

        if (fields.isEmpty()){
            throw new IllegalArgumentException("[fields]不可为空");
        }

        if (numOfFragments==null){
            numOfFragments = NUM_OF_FRAGMENT_DEFAULT;
        }
        if (fragmentSize==null){
            fragmentSize = FRAGMENT_SIZE_DEFAULT;
        }


        HighlightBuilder builder = new HighlightBuilder()
                .preTags(HINT_PRE_H5)
                .postTags(HINT_POST_H5)
                .numOfFragments(numOfFragments)
                .fragmentSize(fragmentSize)
                .requireFieldMatch(requireFieldMatch);


        for (String field : fields) {
            builder.field(field.trim());
        }

        return builder;

    }


    /**
     *      把高亮文字封装到对象中
     * @param searchHits
     * @param <T>
     * @return
     */
    public static  <T> List<T> mappingHighlight(List<org.springframework.data.elasticsearch.core.SearchHit<T>> searchHits){
        final ArrayList<T> result = new ArrayList<>(searchHits.size());
        for (SearchHit<T> searchHit : searchHits) {
            T content = searchHit.getContent();
            Map<String, List<String>> highlightFields = searchHit.getHighlightFields();
            for (Map.Entry<String, List<String>> entry : highlightFields.entrySet()) {
                try {
                    String key = entry.getKey();
                    String value = entry.getValue().get(0);
                    Class<?> aClass = content.getClass();
                    aClass.getDeclaredField(entry.getKey()).setAccessible(true);
                    Field field = aClass.getDeclaredField(key);
                    field.setAccessible(true);
                    field.set(content,value);
                } catch (IllegalAccessException  | NoSuchFieldException e) {
                    log.error("封装高亮文本至实体类时出错,{}",e.getMessage(),e);
                }
            }
            result.add(content);
        }
        return result;
    }






}
