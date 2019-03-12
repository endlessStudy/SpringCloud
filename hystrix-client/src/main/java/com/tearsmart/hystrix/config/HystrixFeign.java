package com.tearsmart.hystrix.config;

import com.tearsmart.hystrix.service.FeignClientService;
import org.springframework.stereotype.Component;

@Component
public class HystrixFeign implements FeignClientService {
    @Override
    public Object getData() {
        return "hystrix 生效!";
    }
}