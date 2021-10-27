package com.exemplo.cellphone.utils;

@Configuration
@EnableSwagger2
class SwaggerConfig {
    //This class is used for creating the documentation
//http://localhost:8080/swagger-ui/
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }
}
