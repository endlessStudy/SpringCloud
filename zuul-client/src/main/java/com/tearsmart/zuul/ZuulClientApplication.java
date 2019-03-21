package com.tearsmart.zuul;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.filters.discovery.PatternServiceRouteMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.ArrayList;
import java.util.List;

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
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
// @EnableSwagger2Doc
public class ZuulClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulClientApplication.class, args);
    }
    /**
     * 使用regexmapper提供serviceId和routes之间的绑定. 它使用正则表达式组来从serviceId提取变量,
     * 然后注入到路由表达式中。
     *
     * 这个意思是说"springms-provider-user-version"将会匹配路由"/version/springms-provider-user/**".
     * 任何正则表达式都可以, 但是所有组必须存在于servicePattern和routePattern之中.
     *
     * @return
     */
    // @Bean
    // public PatternServiceRouteMapper serviceRouteMapper() {
    //     return new PatternServiceRouteMapper("(?<name>^.+)-(?<version>v.+$)",
    //             "${version}/${name}");
    // }
    /*@Component
    @Primary
    class DocumentationConfig implements SwaggerResourcesProvider {
        @Override
        public List<SwaggerResource> get() {
            List resources = new ArrayList<>();
            resources.add(swaggerResource("eureka-client-provide", "/eureka-client-provide/v2/api-docs", "2.0"));
            return resources;
        }

        private SwaggerResource swaggerResource(String name, String location, String version) {
            SwaggerResource swaggerResource = new SwaggerResource();
            swaggerResource.setName(name);
            swaggerResource.setLocation(location);
            swaggerResource.setSwaggerVersion(version);
            return swaggerResource;
        }
    }*/
}
