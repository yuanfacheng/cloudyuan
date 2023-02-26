package com.yuan.nightrain.alibaba.service;

import java.math.BigDecimal;

import com.yuan.nightrain.alibaba.domain.CommonResult;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @auther yuan
 * @create 2023-02-26 15:22
 */
@FeignClient(value = "seata-account-service")
public interface AccountService {
	@PostMapping(value = "/account/decrease")
	CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
