package com.lion.bigdata;

import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * BigDataApplicationTests
 * 大数据模块单元测试类
 *
 * @author Yanzheng
 * @date 2019/01/06
 */
@Ignore
@RunWith(SpringRunner.class)
@SpringBootTest(classes = BigDataApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BigDataApplicationTests {

    /*@LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void contextLoads() {

        HelloWorld hw = new HelloWorld();
        System.out.println(hw.add(1, 2));
        System.out.println(hw.subtract(1, 2));
        System.out.println(hw.multiply(1, 2));

    }

    @Test
    public void testRequest() {
        String url = "http://localhost:" + port;

        ResponseEntity<String> response2 = this.restTemplate.getForEntity(
                url + "/hi", String.class);
        System.out.println(String.format("/hi 调用测试结果为：%s", response2.getBody()));

        ResponseEntity<String> response1 = this.restTemplate.getForEntity(
                url + "/test", String.class, "张三");
        System.out.println(String.format("/test 调用测试结果为：%s", response1.getBody()));
    }*/

}
