package com.yu.learn.mongo.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.yu.learn.global.response.GlobalResponseFactory;
import com.yu.learn.global.web.group.IAddGroup;
import com.yu.learn.global.web.group.IRemoveGroup;
import com.yu.learn.mongo.domain.UserDomain;
import com.yu.learn.mongo.form.UserFormBean;
import com.yu.learn.mongo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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
     * objectMapper
     */
    private final ObjectMapper objectMapper;

    /**
     * user service
     */
    private final UserService userService;

    /**
     * 强制注入
     *
     * @param objectMapper obj
     * @param userService  service
     */
    @Autowired
    public UserController(ObjectMapper objectMapper, UserService userService) {
        this.objectMapper = objectMapper;
        this.userService = userService;
    }

    /**
     * 新增
     *
     * @param userFormBean user
     * @return resp
     */
    @PostMapping("add")
    public ResponseEntity add(@Validated({IAddGroup.class}) @RequestBody UserFormBean userFormBean) {
        return GlobalResponseFactory.ok(userService.add(objectMapper.convertValue(userFormBean, UserDomain.class)));
    }

    /**
     * 删除
     *
     * @param userFormBean user
     * @return resp
     */
    @PostMapping("remove")
    public ResponseEntity remove(@Validated({IRemoveGroup.class}) @RequestBody UserFormBean userFormBean) {
        return GlobalResponseFactory.ok(userFormBean.getIds());
    }

    /**
     * 新增
     *
     * @param type user
     * @return resp
     */
    @PostMapping("type")
    public ResponseEntity res(@RequestParam("type") String type) {
        switch (type) {
            case "1":
                return GlobalResponseFactory.ok();
            case "2":
                return GlobalResponseFactory.bad();
            case "3":
                return GlobalResponseFactory.error();
            default:
        }
        return GlobalResponseFactory.badMsg(type);
    }

    /**
     * 根据名称查询列表
     *
     * @param name 名称
     * @return res
     */
    @GetMapping("findByName")
    public ResponseEntity findByName(@RequestParam("name") String name) {
        return GlobalResponseFactory.ok(userService.findByName(name));
    }
}
