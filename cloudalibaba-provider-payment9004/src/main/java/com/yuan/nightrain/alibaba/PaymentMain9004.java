package com.yuan.nightrain.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @auther yuan
 * @create 2023-02-25 16:13
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9004 {
	public static void main(String[] args) {
		SpringApplication.run(PaymentMain9004.class, args);
	}
}
