package com.tearsmart.eureka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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
 * @date 2019-02-27
 */
@RestController
@RequestMapping("consumer")
public class TestController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("get")
    public Object getData() {
        return restTemplate.getForEntity("http://localhost:2220/provide/get", Object.class);
    }

    @GetMapping("db")
    public Object getDataBalance() {
        ServiceInstance instance = loadBalancerClient.choose("eureka-client-provide");
        String url = "http://" + instance.getHost() + ":" + instance.getPort() + "/provide/get";
        return restTemplate.getForObject(url, Object.class);
    }

    @GetMapping("no")
    public Object getDataNo() {
        return restTemplate.getForEntity("http://eureka-client-provide/provide/get", Object.class);
    }
}
