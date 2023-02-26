package com.yuan.nightrain.config;

import feign.Logger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @auther yuan
 * @create 2023-02-20 9:40
 */
@Configuration
public class FeignConfig {
	@Bean
	Logger.Level feignLoggerLevel() {
		return Logger.Level.FULL;
	}
}
