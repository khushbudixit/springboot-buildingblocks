package com.stacksimplify.restservices.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;

public class AppConfig {
	
	@Bean
	public ModelMapper modelmapper() {
		
		return new ModelMapper();
	}

}
