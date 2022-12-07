package com.etiya.ecommercedemopair1;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EcommerceDemoPair1Application {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceDemoPair1Application.class, args);
	}
	@Bean
	public ModelMapper ModelMapper()
	{
		return new ModelMapper();
	}

}
