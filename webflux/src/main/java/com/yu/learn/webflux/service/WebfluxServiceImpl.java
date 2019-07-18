package com.yu.learn.webflux.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.HashMap;
import java.util.Map;

/**
 * 〈功能简述〉
 *
 * @author yuyonghua
 * @date 2019/7/8 16:53
 */
@Slf4j
@Service
public class WebfluxServiceImpl implements WebfluxService {

    /**
     * web Client
     */
    private final WebClient webClient;

    public WebfluxServiceImpl(WebClient.Builder builder) {
        this.webClient = builder.build();
    }

    @Override
    public String requestBaiDu() {
        Map<String, String> uriMap = new HashMap<>();
        String body = "";
        webClient.post().uri("", uriMap).syncBody(body);
        return null;
    }
}
