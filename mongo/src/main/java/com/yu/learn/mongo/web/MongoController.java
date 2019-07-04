package com.yu.learn.mongo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈功能简述〉
 *
 * @author yuyonghua
 * @date 2019/7/4 16:10
 */
@RestController
public class MongoController {

    @RequestMapping(value = {"/", "/mongo"})
    public String home() {
        return "Hello Mongo";
    }
}
