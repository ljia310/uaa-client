package com.uaaclient.feign;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by liujia on 2017/9/23.
 */
@Configuration
public class feignconfig {
    @Value("${uaa.client.authHost}")
    private String authHost;
    @Value("${uaa.client.clientId:app-id}")
    private String clientId;
    @Value("${uaa.client.secret:app-secret}")
    private String secret;
    @Value("${uaa.client.authHeader:access-token}")
    private String authHeader;
    @Value("${uaa.client.tokenHead:uaa-token}")
    private String tokenHead;

    @Bean
    public FeignInterceptor authenticationInterceptor() {
        return new FeignInterceptor(clientId, secret, authHeader, authHost, tokenHead);
    }
}
