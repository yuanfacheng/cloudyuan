package com.yuan.nightrain.service.impl;

import java.util.UUID;

import javax.annotation.Resource;

import com.yuan.nightrain.service.IMessageProvider;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

/**
 * @auther yuan
 * @create 2023-02-22 10:56
 */
@EnableBinding(Source.class) //定义消息的推送管道
public class MessageProviderImpl implements IMessageProvider {
	@Resource
	private MessageChannel output; // 消息发送管道

	@Override
	public String send() {
		String serial = UUID.randomUUID().toString();
		output.send(MessageBuilder.withPayload(serial).build());
		System.out.println("*****serial: " + serial);
		return null;
	}
}
