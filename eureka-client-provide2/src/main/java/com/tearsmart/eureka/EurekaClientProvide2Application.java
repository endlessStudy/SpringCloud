package com.tearsmart.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientProvide2Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientProvide2Application.class, args);
    }

}
