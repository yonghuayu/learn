package com.yu.learn.global.exception;

import com.yu.learn.global.response.GlobalResponseFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * 〈功能简述〉
 *
 * @author yuyonghua
 * @date 2019/7/4 11:57
 */
@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    /**
     * Throwable全局异常
     *
     * @param request 请求
     * @param ex      异常信息
     * @return res
     */
    @ExceptionHandler(Throwable.class)
    public ResponseEntity<?> throwableHandler(HttpServletRequest request, Throwable ex) {
        //获取Http状态
        HttpStatus status = getStatus(request);
        return ResponseEntity.status(status).body(
                GlobalResponseFactory.createGlobalResponse(status, ex.getMessage(), ex));
    }

    /**
     * 自定义全局异常
     *
     * @param request 请求
     * @param ex      异常信息
     * @return res
     */
    @ExceptionHandler(GlobalException.class)
    public ResponseEntity<?> globalExceptionHandler(HttpServletRequest request, GlobalException ex) {
        //获取Http状态
        HttpStatus status = getStatus(request);
        return ResponseEntity.status(status).body(
                GlobalResponseFactory.createGlobalResponse(ex.getCode(), ex.getMessage(), ex));
    }

    /**
     * 获取状态
     *
     * @param request request
     * @return http状态
     */
    private HttpStatus getStatus(HttpServletRequest request) {
        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
        if (statusCode == null) {
            return HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return HttpStatus.valueOf(statusCode);
    }
}
