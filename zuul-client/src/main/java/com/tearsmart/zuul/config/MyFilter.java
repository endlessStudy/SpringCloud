package com.tearsmart.zuul.config;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Configuration;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

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
 * @date 2019-03-05
 */
@Configuration
@Slf4j
public class MyFilter extends ZuulFilter {
    /**
     * 前置过滤器。
     * 在 zuul 中定义了四种不同生命周期的过滤器类型：
     *      1、pre：可以在请求被路由之前调用;
     *      2、route：在路由请求时候被调用；
     *      3、post：在route和error过滤器之后被调用；
     *      4、error：处理请求时发生错误时被调用；
     *
     * @return string
     */
    @Override
    public String filterType() {
        log.info("filterType() return pre");
        return "pre";
    }

    /**
     * 过滤的优先级,数字越大,优先级越低
     * @return int
     */
    @Override
    public int filterOrder() {
        log.info("filterOrder() return 0");
        return 0;
    }

    /**
     * 是否执行过滤 false不执行,true执行
     * @return boolean
     */
    @Override
    public boolean shouldFilter() {
        log.info("shouldFilter() return true");
        return true;
    }

    /**
     * 过滤的具体逻辑
     * @return object
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        String token = request.getParameter("token");
        if (StringUtils.isBlank(token)) {
            log.warn("token is  empty");
            requestContext.setSendZuulResponse(false);
            requestContext.setResponseStatusCode(401);
            try {
                requestContext.getResponse().getWriter().write("token is empty!");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
        return null;
    }
}
