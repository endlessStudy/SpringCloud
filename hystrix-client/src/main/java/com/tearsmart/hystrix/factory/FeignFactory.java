package com.tearsmart.hystrix.factory;

import com.tearsmart.hystrix.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
 * @date 2019-03-17
 */
//利用feign + @Hystrixcommand实现熔断
// @FeignClient(value = "eureka-client-provide", path = "provide")
//利用feign + fallback 属性实现回退
// @FeignClient(value = "eureka-client-provide",
//         path = "provide",fallback = HystrixFactory.class,configuration = FeignConfig.class)
//利用feign + fallbackFactory 属性实现回退
@FeignClient(value = "eureka-client-provide",
        path = "provide",fallbackFactory = HystrixCallbackFactory.class,configuration = FeignConfig.class)
public interface FeignFactory {
    @RequestMapping(value = "/get/{time}", method = RequestMethod.GET)
    Object getData(@PathVariable long time);
}
