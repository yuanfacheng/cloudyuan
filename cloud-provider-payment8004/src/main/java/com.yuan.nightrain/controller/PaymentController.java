package com.yuan.nightrain.controller;

import java.util.UUID;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther yuan
 * @create 2023-02-19 14:16
 */
@RestController
@Slf4j
public class PaymentController {
	@Value("${server.port}")
	private String serverPort;

	@RequestMapping(value = "/payment/zk")
	public String paymentzk() {
		return "springcloud with zookeeper: " + serverPort + "\t" + UUID.randomUUID().toString();
	}
}
