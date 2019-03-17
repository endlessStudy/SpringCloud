package com.tearsmart.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

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
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }

}
