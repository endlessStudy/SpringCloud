package com.tearsmart.hystrix.controller;

import com.tearsmart.hystrix.service.HystrixService;
import com.tearsmart.hystrix.service.HystrixcommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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
@RestController
public class FeignController {
    @Autowired
    private HystrixService hystrixService;
    @Autowired
    private HystrixcommandService hystrixcommandService;

    @GetMapping("get/{time}")
    public Object getData(@PathVariable long time) throws InterruptedException {
        return hystrixService.getData(time);
    }
    @GetMapping("call/{time}")
    public Object getDataWithCall(@PathVariable long time) throws InterruptedException {
        return hystrixcommandService.getDataWithCall(time);
    }

}
