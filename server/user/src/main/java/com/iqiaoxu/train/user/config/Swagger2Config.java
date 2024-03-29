package com.iqiaoxu.train.user.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author 游由
 * @version 0.0.1
 * @since 0.0.1
 * create time 2019/6/29 10:54
 */
//@Configuration
public class Swagger2Config {
    @Bean
    public Docket getDocket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.iqiaoxu.train.user.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("User Api")
                .description("用户模块API")
                .contact(new Contact("游由","https://iqiaoxu.com","huang_xianjun@live.cn"))
                .version("0.0.1")
                .build();
    }
}
