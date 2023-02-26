package com.yuan.nightrain.service.impl;

import javax.annotation.Resource;

import com.yuan.nightrain.dao.PaymentDao;
import com.yuan.nightrain.entities.Payment;
import com.yuan.nightrain.service.PaymentService;

import org.springframework.stereotype.Service;

/**
 * @auther yuan
 * @create 2023-02-18 10:40
 */
@Service
public class PaymentServiceImpl implements PaymentService {
	@Resource
	private PaymentDao paymentDao;

	public int create(Payment payment) {
		return paymentDao.create(payment);
	}

	public Payment getPaymentById(Long id) {
		return paymentDao.getPaymentById(id);
	}
}
