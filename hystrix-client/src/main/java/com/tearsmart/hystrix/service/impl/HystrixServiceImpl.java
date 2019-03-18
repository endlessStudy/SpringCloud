package com.tearsmart.hystrix.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.tearsmart.hystrix.factory.FeignFactory;
import com.tearsmart.hystrix.service.HystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
@Service
public class HystrixServiceImpl implements HystrixService {
    @Autowired
    private FeignFactory factory;

    /**
     * 利用@HystrixCommand(fallbackMethod = "callBack")注解实现熔断
     * 需要用fallbackMethod属性指定回调方法,此时回调方法名字不需要和方法名字一样
     * @return
     */
    @Override
    @HystrixCommand(fallbackMethod = "callBack")
    public Object getDataWithCall(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return factory.getData();
    }

    public Object callBack(long time) {
        return "Hystrix 熔断生效!";
    }

    @Override
    public Object getData(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return factory.getData();
    }
}
