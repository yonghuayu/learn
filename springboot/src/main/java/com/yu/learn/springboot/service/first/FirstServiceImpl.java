package com.yu.learn.springboot.service.first;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * 〈功能简述〉
 *
 * @author yuyonghua
 * @date 2019/7/1 15:08
 */
@Service
public class FirstServiceImpl implements FirstService {

    /**
     * first
     *
     * @param msg 消息
     * @return 消息
     */
    @Override
    public String first(String msg) {
        return "time: " + LocalDateTime.now();
    }
}
