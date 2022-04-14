package com.zensar.messageapi.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/*
 * @author Sathish
 * This Configuration File is needed for Customizing CORS Configuration 
 * CORS- Cross Origin Resources Sharing 
 */
@Configuration
public class WebConfiguration implements WebMvcConfigurer{
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {

		registry
		
				.addMapping("/api/**")
				.allowedMethods("*")					//it can allowes the all mappings
				.allowedOrigins("http://localhost:4200");
	}
}
