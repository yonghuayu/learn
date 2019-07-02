package com.yu.learn.mongo.web;

import com.yu.learn.mongo.domain.UserDomain;
import com.yu.learn.mongo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * 〈功能简述〉
 *
 * @author yuyonghua
 * @date 2019/6/28 16:47
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    /**
     * user service
     */
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * 新增
     *
     * @param userDomain user
     * @return resp
     */
    @PostMapping("add")
    public ResponseEntity add(@Valid @RequestBody UserDomain userDomain) {
        return ResponseEntity.ok(userService.add(userDomain));
    }

    /**
     * 根据名称查询列表
     *
     * @param name 名称
     * @return res
     */
    @GetMapping("findByName")
    public ResponseEntity findByName(@RequestParam("name") String name) {
        return ResponseEntity.ok(userService.findByName(name));
    }
}
