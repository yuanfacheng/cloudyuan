package com.yuan.nightrain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @auther yuan
 * @create 2023-02-18 23:44
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7002 {
	public static void main(String[] args) {
		/**
		 * EMERGENCY! EUREKA MAY BE INCORRECTLY CLAIMING INSTANCES ARE UP WHEN THEY'RE NOT. RENEWALS ARE LESSER THAN THRESHOLD AND HENCE THE INSTANCES ARE NOT BEING EXPIRED JUST TO BE SAFE.
		 */
		SpringApplication.run(EurekaMain7002.class, args);
	}
}
