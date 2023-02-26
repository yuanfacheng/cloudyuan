package com.yuan.nightrain.lb;

import java.util.List;

import org.springframework.cloud.client.ServiceInstance;

/**
 * @auther yuan
 * @create 2023-02-19 20:31
 */
public interface LoadBalancer {
	ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
