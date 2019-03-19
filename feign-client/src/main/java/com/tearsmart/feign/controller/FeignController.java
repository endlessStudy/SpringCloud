package com.tearsmart.feign.controller;

import com.netflix.discovery.converters.Auto;
import com.tearsmart.feign.service.FeignAuth;
import com.tearsmart.feign.service.FeignClientService;
import com.tearsmart.feign.service.FeignClientService2;
import com.tearsmart.feign.service.TestInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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
@RestController
public class FeignController {
    @Autowired
    private TestInterface test;
    @Autowired
    private FeignAuth auth;

    @GetMapping("/get")
    public Object getData() {
        return test.getData();
    }

    @GetMapping("/get2")
    public Object getData2() {
        return test.getData2();
    }
    @GetMapping("/auth/{serviceName}")
    public Object authTest(@PathVariable String serviceName){
        return auth.findServiceInfoFromEurekaByServiceName(serviceName);
    }

}
