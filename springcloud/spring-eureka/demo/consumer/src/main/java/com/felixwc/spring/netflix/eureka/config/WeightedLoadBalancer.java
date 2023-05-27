package com.felixwc.spring.netflix.eureka.config;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.DefaultResponse;
import org.springframework.cloud.client.loadbalancer.Request;
import org.springframework.cloud.client.loadbalancer.Response;
import org.springframework.cloud.loadbalancer.core.NoopServiceInstanceListSupplier;
import org.springframework.cloud.loadbalancer.core.ReactorServiceInstanceLoadBalancer;
import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;
//@Component
public class WeightedLoadBalancer implements ReactorServiceInstanceLoadBalancer {

    ObjectProvider<ServiceInstanceListSupplier> serviceInstanceListSupplierProvider;

    public WeightedLoadBalancer(ObjectProvider<ServiceInstanceListSupplier> serviceInstanceListSupplierProvider) {

        this.serviceInstanceListSupplierProvider = serviceInstanceListSupplierProvider;
    }

    @Override
    public Mono<Response<ServiceInstance>> choose(Request request) {
        ServiceInstanceListSupplier supplier = serviceInstanceListSupplierProvider
                .getIfAvailable(NoopServiceInstanceListSupplier::new);

        return supplier.get(request)//获取目标IP列表
                .next()
                .map(serviceInstances/*目标IP列表*/ -> {//加权算法筛选出目标IP
                    System.out.println(serviceInstances.size());
                    return new DefaultResponse(serviceInstances.get(0));
                });
    }
}
