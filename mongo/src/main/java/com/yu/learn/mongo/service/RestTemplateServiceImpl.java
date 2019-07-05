package com.yu.learn.mongo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 〈功能简述〉
 *
 * @author yuyonghua
 * @date 2019/7/5 11:54
 */
@Slf4j
@Service
public class RestTemplateServiceImpl implements RestTemplateService {

    /**
     * rest
     */
    private final RestTemplate restTemplate;

    @Autowired
    public RestTemplateServiceImpl(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @Override
    public String requestBaiDu() {
        ResponseEntity<String> res = restTemplate.getForEntity("https://www.baidu.com", String.class);
        log.info("res: {}", res);

        // WebClient
        return res.toString();
    }
}
