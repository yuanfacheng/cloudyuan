package com.yuan.nightrain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @auther yuan
 * @create 2023-02-17 21:13
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8002 {
	public static void main(String[] args) {
		SpringApplication.run(PaymentMain8002.class, args);
	}
}
