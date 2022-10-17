package pro.goforit.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Dynamic;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: Double>J
 * @email: zjj20001031@foxmail.com
 * @editTime: 2022/10/13 9:12
 * @desc:
 **/
@Data
@Document(indexName = "articles",dynamic = Dynamic.FALSE)
public class ArticleEsDomain implements Serializable {
    private static final long serialVersionUID = -190715020406202507L;

    @Id
    private String id;

    @Field(type = FieldType.Text,analyzer = "ik_max_word",searchAnalyzer = "ik_smart")
    private String title;

    @Field(type = FieldType.Keyword)
    private String category1;

    @Field(type = FieldType.Keyword)
    private String category2;

    @Field(type = FieldType.Keyword)
    private String category3;

    @Field(type = FieldType.Keyword)
    private String category4;

    @Field(type = FieldType.Text,analyzer = "ik_max_word",searchAnalyzer = "ik_smart")
    private String plainText;

    @Field(type = FieldType.Text,analyzer = "ik_max_word",searchAnalyzer = "ik_smart")
    private String keywords;

    @Field(type = FieldType.Date)
    private Date writeTime;


}
