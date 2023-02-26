package com.yuan.nightrain.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @auther yuan
 * @create 2023-02-18 17:27
 */
@Configuration
public class ApplicationContextConfig {
	@Bean
	//@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
//applicationContext.xml <bean id="" class="">