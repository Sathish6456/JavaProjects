package com.zensar.messageApi.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Configuration {

	@Bean
	public Docket getDocket() {
		Docket d1=new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/api/**"))	//this tells which url path to be used while creating documentaion
														//in this case any controller which had api in it's url will be considered 
														//for swagger documentations
				.apis(RequestHandlerSelectors.basePackage("com.zensar")) // this tells which basepackages is consider for swagger documentation
				.build();
		return d1;
	}
}
