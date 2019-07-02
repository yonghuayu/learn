package com.yu.learn.springboot.web;

import com.yu.learn.springboot.service.first.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * test
 *
 * @author yuyonghua
 * @date 2019/7/1 15:03
 */
@RestController
@RequestMapping("/first")
public class FirstController {

    /**
     * first service
     */
    private final FirstService firstService;

    /**
     * 构造器方式强制注入
     *
     * @param firstService service
     */
    @Autowired
    public FirstController(FirstService firstService) {
        this.firstService = firstService;
    }

    /**
     * first
     *
     * @param msg 消息
     * @return 消息
     */
    @GetMapping("msg")
    public ResponseEntity first(@RequestParam("first") String msg) {
        return ResponseEntity.ok(firstService.first(msg));
    }
}
