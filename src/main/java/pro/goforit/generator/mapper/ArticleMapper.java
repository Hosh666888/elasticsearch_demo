package pro.goforit.generator.mapper;

import pro.goforit.generator.domain.Article;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
* @author zjj20
* @description 针对表【article】的数据库操作Mapper
* @createDate 2022-10-17 08:36:01
* @Entity pro.goforit.generator.domain.Article
*/
@Mapper
@Repository
public interface ArticleMapper {



    List<Article> selectAll();

}
