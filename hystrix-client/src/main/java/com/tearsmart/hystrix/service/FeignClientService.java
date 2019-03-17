package com.tearsmart.hystrix.service;

import com.tearsmart.hystrix.config.FeginConfig;
import com.tearsmart.hystrix.config.HystrixFeign;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * <p>
 * |****************************** *_* ******************************|
 * |   __                                                      __    |
 * | _/  |_  ____ _____ _______    ______ _____ _____ ________/  |_  |
 * | \   __\/ __ \\__  \\_  __ \  /  ___//     \\__  \\_  __ \   __\ |
 * |  |  | \  ___/ / __ \|  | \/  \___ \|  Y Y  \/ __ \|  | \/|  |   |
 * |  |__|  \___  >____  /__|    /____  >__|_|  (____  /__|   |__|   |
 * |            \/     \/             \/      \/     \/              |
 * |                                                                 |
 * |****************************** *_* ******************************|
 * </p>
 * @author tear-smart
 * @date 2019-03-01
 */
@FeignClient(name = "eureka-client-provide", configuration = FeginConfig.class, fallback = HystrixFeign.class,path = "provide")
public interface FeignClientService {
    @GetMapping("/get")
    Object getData();
}
