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
     * @param status http状态
     * @return bean
     */
    public static GlobalResponse createGlobalResponse(HttpStatus status) {
        return createGlobalResponse(status.value(), status.getReasonPhrase(), status.getReasonPhrase());
    }

    /**
     * 创建响应对象
     *
     * @param status http状态
     * @param msg    描述信息
     * @return bean
     */
    public static GlobalResponse createGlobalResponse(HttpStatus status, String msg) {
        return createGlobalResponse(status.value(), msg, status.getReasonPhrase());
    }

    /**
     * 创建响应对象
     *
     * @param status  http状态
     * @param dataObj 业务数据对象
     * @return bean
     */
    public static GlobalResponse createGlobalResponse(HttpStatus status, Object dataObj) {
        return createGlobalResponse(status.value(), status.getReasonPhrase(), dataObj);
    }

    /**
     * 创建响应对象
     *
     * @param status  状态
     * @param msg     描述信息
     * @param dataObj 业务数据对象
     * @return bean
     */
    public static GlobalResponse createGlobalResponse(HttpStatus status, String msg, Object dataObj) {
        return createGlobalResponse(status.value(), msg, dataObj);
    }

    /**
     * 创建响应对象
     *
     * @param code    状态码
     * @param msg     描述信息
     * @param dataObj 业务数据对象
     * @return bean
     */
    public static GlobalResponse createGlobalResponse(int code, String msg, Object dataObj) {
        return GlobalResponse.builder().code(code).msg(msg).dataObjs(dataObj).build();
    }


    /**
     * 默认响应成功的对象
     *
     * @return bean
     */
    public static GlobalResponse okResponse() {
        return createGlobalResponse(HttpStatus.OK);
    }

    /**
     * 响应成功的对象
     *
     * @param msg 描述信息
     * @return bean
     */
    public static GlobalResponse okMsgResponse(String msg) {
        return createGlobalResponse(HttpStatus.OK, msg);
    }

    /**
     * 响应成功的对象
     *
     * @param dataObj 业务数据对象
     * @return bean
     */
    public static GlobalResponse okResponse(Object dataObj) {
        return createGlobalResponse(HttpStatus.OK, dataObj);
    }

    /**
     * 响应成功的对象
     *
     * @param msg     描述信息
     * @param dataObj 业务数据对象
     * @return bean
     */
    public static GlobalResponse okResponse(String msg, Object dataObj) {
        return createGlobalResponse(HttpStatus.OK, msg, dataObj);
    }

    /**
     * 默认错误响应对象
     *
     * @return bean
     */
    public static GlobalResponse badResponse() {
        return createGlobalResponse(HttpStatus.BAD_REQUEST);
    }

    /**
     * 错误的响应对象
     *
     * @param msg 错误描述信息
     * @return bean
     */
    public static GlobalResponse badMsgResponse(String msg) {
        return createGlobalResponse(HttpStatus.BAD_REQUEST, msg);
    }

    /**
     * 错误的响应对象
     *
     * @param dataObj 业务数据对象
     * @return bean
     */
    public static GlobalResponse badResponse(Object dataObj) {
        return createGlobalResponse(HttpStatus.BAD_REQUEST, dataObj);
    }

    /**
     * 错误的响应对象
     *
     * @param msg     自定义错误描述信息
     * @param dataObj 自定义业务数据对象
     * @return bean
     */
    public static GlobalResponse badResponse(String msg, Object dataObj) {
        return createGlobalResponse(HttpStatus.BAD_REQUEST, msg, dataObj);
    }

    /**
     * 默认异常响应对象
     *
     * @return bean
     */
    public static GlobalResponse errorResponse() {
        return createGlobalResponse(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    /**
     * 异常的响应对象
     *
     * @param msg 异常描述信息
     * @return bean
     */
    public static GlobalResponse errorResponse(String msg) {
        return createGlobalResponse(HttpStatus.INTERNAL_SERVER_ERROR, msg);
    }

    /**
     * 异常的响应对象
     *
     * @param dataObj 业务数据对象
     * @return bean
     */
    public static GlobalResponse errorResponse(Object dataObj) {
        return createGlobalResponse(HttpStatus.INTERNAL_SERVER_ERROR, dataObj);
    }

    /**
     * 异常的响应对象
     *
     * @param msg     自定义异常描述信息
     * @param dataObj 自定义业务数据对象
     * @return bean
     */
    public static GlobalResponse errorResponse(String msg, Object dataObj) {
        return createGlobalResponse(HttpStatus.INTERNAL_SERVER_ERROR, msg, dataObj);
    }

    /**
     * 默认响应成功
     *
     * @return bean
     */
    public static ResponseEntity ok() {
        return ResponseEntity.ok(okResponse());
    }

    /**
     * 响应成功的对象
     *
     * @param msg 描述信息
     * @return bean
     */
    public static ResponseEntity okMsg(String msg) {
        return ResponseEntity.ok(okMsgResponse(msg));
    }

    /**
     * 响应成功的对象
     *
     * @param dataObj 业务数据对象
     * @return bean
     */
    public static ResponseEntity ok(Object dataObj) {
        return ResponseEntity.ok(okResponse(dataObj));
    }

    /**
     * 响应成功的对象
     *
     * @param msg     描述信息
     * @param dataObj 业务数据对象
     * @return bean
     */
    public static ResponseEntity ok(String msg, Object dataObj) {
        return ResponseEntity.ok(okResponse(msg, dataObj));
    }

    /**
     * 响应成功的对象
     *
     * @param response 响应对象
     * @return bean
     */
    public static ResponseEntity ok(GlobalResponse response) {
        return ResponseEntity.ok(response);
    }

    /**
     * 默认错误响应对象
     *
     * @return bean
     */
    public static ResponseEntity bad() {
        return ResponseEntity.badRequest().body(badResponse());
    }

    /**
     * 错误的响应对象
     *
     * @param msg 错误描述信息
     * @return bean
     */
    public static ResponseEntity badMsg(String msg) {
        return ResponseEntity.badRequest().body(badMsgResponse(msg));
    }

    /**
     * 错误的响应对象
     *
     * @param dataObj 业务数据对象
     * @return bean
     */
    public static ResponseEntity bad(Object dataObj) {
        return ResponseEntity.badRequest().body(badResponse(dataObj));
    }

    /**
     * 错误的响应对象
     *
     * @param msg     自定义错误描述信息
     * @param dataObj 自定义业务数据对象
     * @return bean
     */
    public static ResponseEntity bad(String msg, Object dataObj) {
        return ResponseEntity.badRequest().body(badResponse(msg, dataObj));
    }

    /**
     * 错误的响应对象
     *
     * @param response 对象
     * @return bean
     */
    public static ResponseEntity bad(GlobalResponse response) {
        return ResponseEntity.badRequest().body(response);
    }

    /**
     * 默认异常响应对象
     *
     * @return bean
     */
    public static ResponseEntity error() {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse());
    }

    /**
     * 错误的响应对象
     *
     * @param msg 错误描述信息
     * @return bean
     */
    public static ResponseEntity errorMsg(String msg) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse(msg));
    }

    /**
     * 错误的响应对象
     *
     * @param dataObj 业务数据对象
     * @return bean
     */
    public static ResponseEntity error(Object dataObj) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse(dataObj));
    }

    /**
     * 错误的响应对象
     *
     * @param msg     自定义错误描述信息
     * @param dataObj 自定义业务数据对象
     * @return bean
     */
    public static ResponseEntity error(String msg, Object dataObj) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errorResponse(msg, dataObj));
    }

    /**
     * 异常的响应对象
     *
     * @param response 对象
     * @return bean
     */
    public static ResponseEntity error(GlobalResponse response) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
    }

    /**
     * 响应对象
     *
     * @param status   http状态
     * @param response 对象
     * @return bean
     */
    public static ResponseEntity entity(HttpStatus status, GlobalResponse response) {
        return ResponseEntity.status(status).body(response);
    }
}
