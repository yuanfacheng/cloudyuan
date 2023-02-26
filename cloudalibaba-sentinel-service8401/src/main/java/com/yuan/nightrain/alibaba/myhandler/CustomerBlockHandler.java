package com.yuan.nightrain.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.yuan.nightrain.entities.CommonResult;

/**
 * @auther yuan
 * @create 2023-02-25 15:32
 */
public class CustomerBlockHandler {
	public static CommonResult handlerException(BlockException exception) {
		return new CommonResult(4444, "按客戶自定义,global handlerException----1");
	}

	public static CommonResult handlerException2(BlockException exception) {
		return new CommonResult(4444, "按客戶自定义,global handlerException----2");
	}
}
