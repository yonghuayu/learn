package com.yu.learn.global.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * 统一的返回格式
 *
 * @author yuyonghua
 * @date 2019/7/2 11:38
 */
public class GlobalResponseFactory {

    /**
     * 创建响应对象
     *
     * @param code    状态码
     * @param msg     描述信息
     * @param dataObj 业务数据对象
     * @return bean
     */
    private static GlobalResponse createGlobalResponse(int code, String msg, Object dataObj) {
        return new GlobalResponse(code, msg, dataObj);
    }

    /**
     * 默认响应成功的对象
     *
     * @return bean
     */
    public static GlobalResponse okResponse() {
        return createGlobalResponse(HttpStatus.OK.value(), HttpStatus.OK.getReasonPhrase(),
                HttpStatus.OK.getReasonPhrase());
    }

    /**
     * 响应成功的对象
     *
     * @param msg 描述信息
     * @return bean
     */
    public static GlobalResponse okMsgResponse(String msg) {
        return createGlobalResponse(HttpStatus.OK.value(), msg, HttpStatus.OK.getReasonPhrase());
    }

    /**
     * 响应成功的对象
     *
     * @param dataObj 业务数据对象
     * @return bean
     */
    public static GlobalResponse okResponse(Object dataObj) {
        return createGlobalResponse(HttpStatus.OK.value(), HttpStatus.OK.getReasonPhrase(), dataObj);
    }

    /**
     * 响应成功的对象
     *
     * @param msg     描述信息
     * @param dataObj 业务数据对象
     * @return bean
     */
    public static GlobalResponse okResponse(String msg, Object dataObj) {
        return createGlobalResponse(HttpStatus.OK.value(), msg, dataObj);
    }

    /**
     * 默认错误响应对象
     *
     * @return bean
     */
    public static GlobalResponse badResponse() {
        return createGlobalResponse(HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(),
                HttpStatus.BAD_REQUEST.getReasonPhrase());
    }

    /**
     * 错误的响应对象
     *
     * @param msg 错误描述信息
     * @return bean
     */
    public static GlobalResponse badMsgResponse(String msg) {
        return createGlobalResponse(HttpStatus.BAD_REQUEST.value(), msg, HttpStatus.BAD_REQUEST.getReasonPhrase());
    }

    /**
     * 错误的响应对象
     *
     * @param dataObj 业务数据对象
     * @return bean
     */
    public static GlobalResponse badResponse(Object dataObj) {
        return createGlobalResponse(HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), dataObj);
    }

    /**
     * 错误的响应对象
     *
     * @param msg     自定义错误描述信息
     * @param dataObj 自定义业务数据对象
     * @return bean
     */
    public static GlobalResponse badResponse(String msg, Object dataObj) {
        return createGlobalResponse(HttpStatus.BAD_REQUEST.value(), msg, dataObj);
    }

    /**
     * 默认响应成功
     *
     * @return bean
     */
    public static ResponseEntity ok() {
        return ResponseEntity.ok(createGlobalResponse(HttpStatus.OK.value(), HttpStatus.OK.getReasonPhrase(),
                HttpStatus.OK.getReasonPhrase()));
    }

    /**
     * 响应成功的对象
     *
     * @param msg 描述信息
     * @return bean
     */
    public static ResponseEntity okMsg(String msg) {
        return ResponseEntity.ok(createGlobalResponse(HttpStatus.OK.value(), msg, HttpStatus.OK.getReasonPhrase()));
    }

    /**
     * 响应成功的对象
     *
     * @param dataObj 业务数据对象
     * @return bean
     */
    public static ResponseEntity ok(Object dataObj) {
        return ResponseEntity.ok(createGlobalResponse(HttpStatus.OK.value(), HttpStatus.OK.getReasonPhrase(), dataObj));
    }

    /**
     * 响应成功的对象
     *
     * @param msg     描述信息
     * @param dataObj 业务数据对象
     * @return bean
     */
    public static ResponseEntity ok(String msg, Object dataObj) {
        return ResponseEntity.ok(createGlobalResponse(HttpStatus.OK.value(), msg, dataObj));
    }

    /**
     * 默认错误响应对象
     *
     * @return bean
     */
    public static ResponseEntity bad() {
        return ResponseEntity.badRequest().body(createGlobalResponse(HttpStatus.BAD_REQUEST.value(),
                HttpStatus.BAD_REQUEST.getReasonPhrase(), HttpStatus.BAD_REQUEST.getReasonPhrase()));
    }

    /**
     * 错误的响应对象
     *
     * @param msg 错误描述信息
     * @return bean
     */
    public static ResponseEntity badMsg(String msg) {
        return ResponseEntity.badRequest().body(createGlobalResponse(HttpStatus.BAD_REQUEST.value(),
                msg, HttpStatus.BAD_REQUEST.getReasonPhrase()));
    }

    /**
     * 错误的响应对象
     *
     * @param dataObj 业务数据对象
     * @return bean
     */
    public static ResponseEntity bad(Object dataObj) {
        return ResponseEntity.badRequest().body(createGlobalResponse(HttpStatus.BAD_REQUEST.value(),
                HttpStatus.BAD_REQUEST.getReasonPhrase(), dataObj));
    }

    /**
     * 错误的响应对象
     *
     * @param msg     自定义错误描述信息
     * @param dataObj 自定义业务数据对象
     * @return bean
     */
    public static ResponseEntity bad(String msg, Object dataObj) {
        return ResponseEntity.badRequest().body(createGlobalResponse(HttpStatus.BAD_REQUEST.value(),
                msg, dataObj));
    }
}
