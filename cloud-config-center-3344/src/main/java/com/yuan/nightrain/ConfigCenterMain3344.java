package com.yuan.nightrain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @auther yuan
 * @create 2023-02-21 17:47
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigCenterMain3344 {
	public static void main(String[] args) {
		SpringApplication.run(ConfigCenterMain3344.class, args);
	}
}
