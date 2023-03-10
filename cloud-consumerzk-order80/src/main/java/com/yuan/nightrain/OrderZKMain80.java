package com.yuan.nightrain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @auther yuan
 * @create 2023-02-19 15:19
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZKMain80 {
	public static void main(String[] args) {
		SpringApplication.run(OrderZKMain80.class, args);
	}
}
