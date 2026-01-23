package com.project.fitness.config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI customAPI(){
        return new OpenAPI()
                .info(new Info()
                        .title("Fitness Tracker API")
                        .version("v1.0")
                        .description("Production Grade APIs")
                        .contact(new Contact()
                                .name("Harshal Saonerkar")
                                .email("harshalsaonerkar702@gmail.com")
                        )
                );
    }
}
