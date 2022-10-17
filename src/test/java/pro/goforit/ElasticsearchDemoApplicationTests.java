package pro.goforit;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import pro.goforit.util.EsUtil;

import javax.annotation.Resource;

@SpringBootTest
class ElasticsearchDemoApplicationTests {

    @Resource
    private EsUtil esUtil;


}
