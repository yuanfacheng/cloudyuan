package com.yuan.nightrain.service;

import com.yuan.nightrain.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @auther yuan
 * @create 2023-02-18 10:40
 */
public interface PaymentService {
	public int create(Payment payment);

	public Payment getPaymentById(@Param("id") Long id);
}
