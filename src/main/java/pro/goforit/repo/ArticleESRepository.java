package pro.goforit.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.repository.query.Param;
import pro.goforit.domain.ArticleEsDomain;

import java.util.List;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2022/10/13 9:18
 * @desc:
 **/
public interface ArticleESRepository extends ElasticsearchRepository<ArticleEsDomain,String> {

    List<ArticleEsDomain> getArticleEsDomainsByTitleContains(String title, Pageable pageable);



    List<ArticleEsDomain> getArticleEsDomainByKeywordsContainsAndPlainTextContainsOrderByWriteTime(
            @Param("keywords") String keywords
            ,@Param("plainText")String plainText
    );


}
