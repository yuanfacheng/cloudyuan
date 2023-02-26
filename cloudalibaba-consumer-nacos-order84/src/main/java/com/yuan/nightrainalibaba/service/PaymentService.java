package com.yuan.nightrainalibaba.service;

import com.yuan.nightrain.entities.CommonResult;
import com.yuan.nightrain.entities.Payment;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @auther yuan
 * @create 2023-02-25 18:15
 */
@FeignClient(value = "nacos-payment-provider", fallback = PaymentFallbackService.class)
public interface PaymentService {
	@GetMapping(value = "/paymentSQL/{id}")
	public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);
}
