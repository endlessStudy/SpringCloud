package com.tearsmart.feign.service.impl;

import com.tearsmart.feign.service.FeignClientService;
import com.tearsmart.feign.service.FeignClientService2;
import com.tearsmart.feign.service.TestInterface;
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
 * @date 2019-03-18
 */
@Service
public class TestImpl implements TestInterface {
    @Autowired
    private FeignClientService service;
    @Autowired
    private FeignClientService2 service2;

    @Override
    public Object getData(long time) {
        return service.getData(time);
    }

    @Override
    public Object getData2() {
        return service2.getData();
    }
}
