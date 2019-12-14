package ilcarro.controller;

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

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
//                .apis(RequestHandlerSelectors.any())
                .apis(RequestHandlerSelectors.basePackage("ilcarro.controller.impl"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(metaData())
                .useDefaultResponseMessages(false)
                ;
    }

    private ApiInfo metaData() {
        return new ApiInfoBuilder()
                .title("IL carro")
                .description("\"IL carro REST API\"")
                .version("1.0-SNAPSHOT")
                .license("telran licence version 1.0")
                .licenseUrl("http://www.tel-ran.com/licenses/LICENSE-1.0")
                .termsOfServiceUrl("http://www.tel-ran.com/services")
                .contact(new Contact("Andrew Miterev", "https://www.tel-ran.com/", "andrew.miterev@gmail.com"))
                .build();
    }
}

