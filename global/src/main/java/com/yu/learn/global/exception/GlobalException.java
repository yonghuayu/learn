package com.yu.learn.global.exception;

import lombok.Builder;
import lombok.Data;

/**
 * 〈功能简述〉
 *
 * @author yuyonghua
 * @date 2019/7/2 11:32
 */
@Data
@Builder
public class GlobalException extends Exception {

    /**
     * 错误码
     */
    private int code;

    /**
     * 说明信息
     */
    private String msg;

}
