package com.iqiaoxu.train.common.config;

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
 * create time 2019/7/2 13:39
 */
@Configuration
public class Swagger2Config {
    private Contact author = new Contact("游由","https://iqiaoxu.com","huang_xianjun@live.cn");
    @Bean
    public Docket getDocket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.iqiaoxu.train"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("API")
                .description("API说明文档")
                .contact(author)
                .version("0.0.1")
                .build();
    }
}
