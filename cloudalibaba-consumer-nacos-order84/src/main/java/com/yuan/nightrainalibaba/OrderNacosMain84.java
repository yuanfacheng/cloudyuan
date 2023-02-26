package com.yuan.nightrainalibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @auther yuan
 * @create 2023-02-25 16:04
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class OrderNacosMain84 {
	public static void main(String[] args) {
		SpringApplication.run(OrderNacosMain84.class, args);
	}
}
