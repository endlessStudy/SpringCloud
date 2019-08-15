package com.tearsmart.feign.service;

import com.tearsmart.feign.config.Config;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

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
 *
 * @RequestLine feign请求注解,需要配置Contract bean
 *     @Bean
 *     public Contract feignConfiguration() {
 *         return new feign.Contract.Default();
 *     }
 *
 * </p>
 * @author tear-smart
 * @date 2019-03-19
 */
@FeignClient(value = "xxxx", url = "http://localhost:8761", configuration = Config.class)
public interface FeignAuth {
    @RequestLine("GET /eureka/apps/{serviceName}")
    String findServiceInfoFromEurekaByServiceName(@Param("serviceName") String serviceName);
}
