package com.example.carjpademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableWebMvc
@SpringBootApplication
@EnableSwagger2
public class CarJpaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarJpaDemoApplication.class, args);
	}
	
	@Bean
	public InternalResourceViewResolver defultViewResolver() {
		return new InternalResourceViewResolver();
	}
}
