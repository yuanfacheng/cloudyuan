package com.yuan.nightrain.service;

import com.yuan.nightrain.entities.CommonResult;
import com.yuan.nightrain.entities.Payment;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @auther yuan
 * @create 2023-02-19 23:59
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {
	@GetMapping(value = "/payment/get/{id}")
	public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

	@GetMapping(value = "/payment/feign/timeout")
	public String paymentFeignTimeout();
}
