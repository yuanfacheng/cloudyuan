package com.yuan.nightrainalibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @auther yuan
 * @create 2023-02-23 14:44
 */
@EnableDiscoveryClient
@SpringBootApplication
public class OrderNacosMain83 {
	public static void main(String[] args) {
		SpringApplication.run(OrderNacosMain83.class, args);
	}
}
