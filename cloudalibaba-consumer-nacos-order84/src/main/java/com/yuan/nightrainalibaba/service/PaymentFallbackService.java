package com.yuan.nightrainalibaba.service;

import com.yuan.nightrain.entities.CommonResult;
import com.yuan.nightrain.entities.Payment;

import org.springframework.stereotype.Component;

/**
 * @auther yuan
 * @create 2023-02-25 18:30
 */
@Component
public class PaymentFallbackService implements PaymentService {
	@Override
	public CommonResult<Payment> paymentSQL(Long id) {
		return new CommonResult<>(44444, "服务降级返回,---PaymentFallbackService", new Payment(id, "errorSerial"));
	}
}
