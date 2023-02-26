package com.yuan.nightrain.alibaba.controller;

import javax.annotation.Resource;

import com.yuan.nightrain.alibaba.domain.CommonResult;
import com.yuan.nightrain.alibaba.domain.Order;
import com.yuan.nightrain.alibaba.service.OrderService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther yuan
 * @create 2023-02-26 15:24
 */
@RestController
public class OrderController {
	@Resource
	private OrderService orderService;


	@GetMapping("/order/create")
	public CommonResult create(Order order) {
		orderService.create(order);
		return new CommonResult(200, "订单创建成功");
	}
}
