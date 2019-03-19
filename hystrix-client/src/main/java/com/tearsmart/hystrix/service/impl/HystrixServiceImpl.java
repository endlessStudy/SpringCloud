package com.tearsmart.hystrix.service.impl;

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

    @Override
    public Object getData(long time) {
        return getObject(time);
    }

    private Object getObject(long time) {
        return factory.getData(time);
    }
}
