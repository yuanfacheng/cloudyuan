package com.yuan.nightrain.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @auther yuan
 * @create 2023-02-24 16:26
 */
@EnableDiscoveryClient
@SpringBootApplication
public class MainApp8401 {
	public static void main(String[] args) {
		SpringApplication.run(MainApp8401.class, args);
	}
}
