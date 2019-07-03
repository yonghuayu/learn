package com.yu.learn.global.response;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * 全局响应对象
 *
 * @author yuyonghua
 * @date 2019/7/2 11:35
 */
@Data
@Builder
public class GlobalResponse implements Serializable {

    /**
     * 接口请求状态码
     */
    private int code;

    /**
     * 描述信息
     */
    private String msg;

    /**
     * 业务数据对象
     */
    private Object dataObjs;

}
