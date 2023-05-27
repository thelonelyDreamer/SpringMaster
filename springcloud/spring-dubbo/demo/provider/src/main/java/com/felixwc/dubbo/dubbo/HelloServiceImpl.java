package com.felixwc.dubbo.dubbo;

import com.felixwc.dubbo.api.HelloService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author 23167
 * @description Java is the best language
 * @date 2023/5/26--@13:57
 */
@DubboService
public class HelloServiceImpl implements HelloService {
    @Override
    public String getHello(String name) {
        return "hello"+name;
    }
}
