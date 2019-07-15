package com.lion.upms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger2Config
 * TODO
 *
 * @author Yanzheng
 * @date 2019/04/19
 * Copyright 2019 Yanzheng. All rights reserved.
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {

    /**
     * 访问地址：http://ip:port/swagger-ui.html
     */
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //设置包路径
                .apis(RequestHandlerSelectors.basePackage("com.lion.upms"))
                .paths(PathSelectors.any())
                //.paths(PathSelectors.regex("/user.*"))
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                //页面标题
                .title("标题：lion-upms 使用 Swagger2 构建 API 接口文档")
                //描述
                .description("描述：用于 lion-upms 接口查看")
                .termsOfServiceUrl("https://github.com/Zzzzang")
                //创建人
                .contact(new Contact("Yanzheng", "https://github.com/Zzzzang", "micyo202@163.com"))
                .version("版本号：1.0.0")
                .build();
    }

}
