package com.yu.learn.webflux.web;

import com.yu.learn.global.response.GlobalResponseFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * 〈功能简述〉
 *
 * @author yuyonghua
 * @date 2019/7/8 16:52
 */
@RestController
@RequestMapping("/webflux")
public class WebfluxController {

    /**
     * 新增
     *
     * @return resp
     */
    @PostMapping("ok")
    public ResponseEntity ok() {
        return GlobalResponseFactory.ok(LocalDateTime.now());
    }
}
