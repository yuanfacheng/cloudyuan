package com.yuan.nightrain.alibaba.dao;

import com.yuan.nightrain.alibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @auther yuan
 * @create 2023-02-26 15:17
 */
@Mapper
public interface OrderDao {
	//1 新建订单
	void create(Order order);

	//2 修改订单状态，从零改为1
	void update(@Param("userId") Long userId, @Param("status") Integer status);
}