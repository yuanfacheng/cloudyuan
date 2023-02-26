package com.yuan.nightrain.dao;

import com.yuan.nightrain.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @auther yuan
 * @create 2023-02-18 10:27
 */
@Mapper
public interface PaymentDao {
	public int create(Payment payment);

	public Payment getPaymentById(@Param("id") Long id);
}
