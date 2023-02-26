package com.yuan.nightrain.controller;

import javax.annotation.Resource;

import com.yuan.nightrain.service.PaymentFeignService;
import com.yuan.nightrain.entities.CommonResult;
import com.yuan.nightrain.entities.Payment;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther yuan
 * @create 2023-02-20 0:05
 */
@RestController
@Slf4j
public class OrderFeignController {
	@Resource
	private PaymentFeignService paymentFeignService;

	@GetMapping(value = "/consumer/payment/get/{id}")
	public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
		return paymentFeignService.getPaymentById(id);
	}

	@GetMapping(value = "/consumer/payment/feign/timeout")
	public String paymentFeignTimeout() {
		// OpenFeign客户端一般默认等待1秒钟
		return paymentFeignService.paymentFeignTimeout();
	}
}
