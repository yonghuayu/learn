package com.yu.learn.global.exception;

/**
 * 〈功能简述〉
 *
 * @author yuyonghua
 * @date 2019/7/2 11:32
 */
public class GlobalException extends Exception {

    /**
     * 错误码
     */
    private int code;

    /**
     * 说明信息
     */
    private String msg;

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

    @Override
    public String toString() {
        return "GlobalException{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }
}
