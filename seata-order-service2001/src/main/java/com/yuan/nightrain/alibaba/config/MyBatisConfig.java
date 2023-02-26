package com.yuan.nightrain.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;

import org.springframework.context.annotation.Configuration;

/**
 * @auther yuan
 * @create 2019-12-11 16:57
 */
@Configuration
@MapperScan({ "com.yuan.nightrain.alibaba.dao" })
public class MyBatisConfig {
}
