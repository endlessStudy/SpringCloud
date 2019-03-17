package com.tearsmart.config.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
 * 获取github上配置文件信息
 * 当指定分支上没有该信息时,将会从默认配置中获取
 * eg : master分支config-server-dev文件中没有时,将会从config-server读取
 * </p>
 * @author tear-smart
 * @date 2019-03-15
 */
@RestController
@RequestMapping("config")
public class TestConfig {
    @Value("${info.name}")
    private String name;
    @GetMapping("getName")
    public String getName(){
        return this.name;
    }
}
