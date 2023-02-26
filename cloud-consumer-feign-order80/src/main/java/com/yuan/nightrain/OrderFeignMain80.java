package com.yuan.nightrain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @auther yuan
 * @create 2023-02-19 23:57
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeignMain80 {
	public static void main(String[] args) {
		SpringApplication.run(OrderFeignMain80.class, args);
	}
}
