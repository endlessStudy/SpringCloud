package com.tearsmart.hystrix.config;

import com.tearsmart.hystrix.service.FeignClientService;
import org.springframework.stereotype.Component;
/**
  * <p>
  *|****************************** *_* ******************************|
  *|   __                                                      __    |
  *| _/  |_  ____ _____ _______    ______ _____ _____ ________/  |_  |
  *| \   __\/ __ \\__  \\_  __ \  /  ___//     \\__  \\_  __ \   __\ |
  *|  |  | \  ___/ / __ \|  | \/  \___ \|  Y Y  \/ __ \|  | \/|  |   |
  *|  |__|  \___  >____  /__|    /____  >__|_|  (____  /__|   |__|   |
  *|            \/     \/             \/      \/     \/              |
  *|                                                                 |
  *|****************************** *_* ******************************|
  * </p>
  * @author tear-smart
  * @date 2019/3/15
  */
@Component
public class HystrixFeign implements FeignClientService {
    @Override
    public Object getData() {
        return "hystrix 生效!";
    }
}