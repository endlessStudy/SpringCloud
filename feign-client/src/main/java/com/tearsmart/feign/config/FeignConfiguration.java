package com.tearsmart.feign.config;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
 * @date 2019-03-14
 */
@Configuration
public class FeignConfiguration {

    @Bean
    public IRule getRule() {
        return new CostomRule();
    }
}
