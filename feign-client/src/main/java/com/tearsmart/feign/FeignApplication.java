package com.tearsmart.feign;

import com.tearsmart.feign.config.ExcludeAnnoncation;
import com.tearsmart.feign.config.FeignConfiguration;
import com.tearsmart.feign.config.FeignConfiguration2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

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
 * ribbon 客户端的负载均衡
 * </p>
 * @author tear-smart
 * @date 2019-02-28
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@RibbonClients(value = {
        @RibbonClient(value = "eureka-client-provide", configuration = FeignConfiguration.class)
        ,@RibbonClient(value = "eureka-client-provide2", configuration = FeignConfiguration2.class)
})
@ComponentScan(excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = ExcludeAnnoncation.class)})
public class FeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class, args);
    }
}
