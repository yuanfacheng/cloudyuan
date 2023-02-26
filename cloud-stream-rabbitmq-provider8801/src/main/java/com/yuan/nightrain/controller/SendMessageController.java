package com.yuan.nightrain.controller;

import javax.annotation.Resource;

import com.yuan.nightrain.service.IMessageProvider;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther yuan
 * @create 2023-02-22 11:17
 */
@RestController
public class SendMessageController {
	@Resource
	private IMessageProvider messageProvider;

	@GetMapping(value = "/sendMessage")
	public String sendMessage() {
		return messageProvider.send();
	}

}
