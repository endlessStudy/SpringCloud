package com.tearsmart.feign.service;

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
 * @author tear-smart
 * @FeignClient(value = "eureka-client-provide", path = "provide")
 * value: 调用的服务的名称
 * path: 路径统一前缀
 * </p>
 * @date 2019-03-01
 */
@FeignClient(value = "eureka-client-provide",url = "http://localhost:8761",path = "provide")
public interface FeignClientService {
    @GetMapping("/get")
    Object getData();
}
