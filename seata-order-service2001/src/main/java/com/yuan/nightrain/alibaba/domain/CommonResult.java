package com.yuan.nightrain.alibaba.domain;

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
public class CommonResult<T> {
	private Integer code;

	private String message;

	private T data;

	public CommonResult(Integer code, String message) {
		this(code, message, null);
	}
}
