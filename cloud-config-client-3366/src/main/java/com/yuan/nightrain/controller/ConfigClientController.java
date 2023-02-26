package com.yuan.nightrain.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther yuan
 * @create 2023-02-21 20:04
 */
@RestController
@RefreshScope
public class ConfigClientController {
	@Value("${server.port}")
	private String serverPort;

	@Value("${config.info}")
	private String configInfo;

	@GetMapping("/configInfo")
	public String configInfo() {
		return "serverPort: " + serverPort + "\t\n\n configInfo: " + configInfo;
	}

}
