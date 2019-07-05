package com.yu.learn.global.exception;

/**
 * 〈功能简述〉
 *
 * @author yuyonghua
 * @date 2019/7/2 11:33
 */
public class GlobalExceptionFactory {


    public static GlobalException exception() {
        return GlobalException.builder().code(200).msg("error").build();
    }
}
