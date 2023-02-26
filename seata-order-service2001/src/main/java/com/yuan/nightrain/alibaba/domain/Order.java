package com.yuan.nightrain.alibaba.domain;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @auther yuan
 * @create 2023-02-26 15:16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
	private Long id;

	private Long userId;

	private Long productId;

	private Integer count;

	private BigDecimal money;

	private Integer status; //订单状态：0：创建中；1：已完结
}
