package com.yu.learn.global.response;

import java.io.Serializable;

/**
 * 全局响应
 *
 * @author yuyonghua
 * @date 2019/7/2 11:35
 */
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

    public GlobalResponse() {
    }

    public GlobalResponse(int code, String msg, Object dataObjs) {
        this.code = code;
        this.msg = msg;
        this.dataObjs = dataObjs;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getDataObjs() {
        return dataObjs;
    }

    public void setDataObjs(Object dataObjs) {
        this.dataObjs = dataObjs;
    }

    @Override
    public String toString() {
        return "GlobalResponse{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", dataObjs=" + dataObjs +
                '}';
    }
}
