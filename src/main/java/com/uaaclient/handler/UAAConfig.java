package com.uaaclient.handler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by liujia on 2017/9/23.
 */
@Configuration
public class UAAConfig extends WebMvcConfigurerAdapter {
    @Value("${gate.client.authHost}")
    private String authHost;
    @Value("${gate.client.authHeader:access-token}")
    private String authHeader;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new UAAInterceptor(authHost,authHeader)).addPathPatterns("/**");
        super.addInterceptors(registry);
    }
}
