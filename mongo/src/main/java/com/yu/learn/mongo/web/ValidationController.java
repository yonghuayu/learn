package com.yu.learn.mongo.web;

import com.yu.learn.global.response.GlobalResponseFactory;
import com.yu.learn.mongo.form.ValidationFormBean;
import com.yu.learn.mongo.service.validation.ValidationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 参数校验
 *
 * @author yuyonghua
 * @date 2019/7/5 15:24
 */
@Slf4j
@RestController
@RequestMapping("/validation")
public class ValidationController {

    /**
     * 参数校验服务
     */
    private final ValidationService validationService;


    public ValidationController(ValidationService validationService) {
        this.validationService = validationService;
    }

    /**
     * 不为null
     *
     * @param msg msg
     * @return msg
     */
    @GetMapping("/notNull")
    public ResponseEntity notNull(@RequestParam("msg") String msg) {
        return GlobalResponseFactory.ok(validationService.notNull(msg));
    }

    /**
     * 不为空
     *
     * @param msg msg
     * @return msg
     */
    @GetMapping("/notBlank")
    public ResponseEntity notBlank(@RequestParam("msg") String msg) {
        return GlobalResponseFactory.ok(validationService.notBlank(msg));
    }

    /**
     * 范围
     *
     * @param msg msg
     * @return msg
     */
    @GetMapping("/size")
    public ResponseEntity size(@RequestParam("msg") String msg) {
        return GlobalResponseFactory.ok(validationService.size(msg));
    }

    /**
     * 不为empty
     *
     * @param msg msg
     * @return msg
     */
    @GetMapping("/notEmpty")
    public ResponseEntity notEmpty(@RequestParam("msg") List<String> msg) {
        return GlobalResponseFactory.ok(validationService.notEmpty(msg));
    }

    /**
     * 最大值为3
     *
     * @param msg msg
     * @return msg
     */
    @GetMapping("/max")
    public ResponseEntity max(@RequestParam("msg") int msg) {
        return GlobalResponseFactory.ok(validationService.max(msg));
    }

    /**
     * 最小值为3
     *
     * @param msg msg
     * @return msg
     */
    @GetMapping("/min")
    public ResponseEntity min(@RequestParam("msg") long msg) {
        return GlobalResponseFactory.ok(validationService.min(msg));
    }

    /**
     * 新增
     *
     * @param msg msg
     * @return msg
     */
    @PostMapping("/add")
    public ResponseEntity add(@RequestBody ValidationFormBean msg) {
        return GlobalResponseFactory.ok(validationService.add(msg));
    }

    /**
     * 编辑
     *
     * @param msg msg
     * @return msg
     */
    @PostMapping("/modify")
    public ResponseEntity modify(@RequestBody ValidationFormBean msg) {
        return GlobalResponseFactory.ok(validationService.modify(msg));
    }
}
