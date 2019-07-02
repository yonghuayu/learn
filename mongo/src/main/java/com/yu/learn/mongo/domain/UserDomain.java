package com.yu.learn.mongo.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 用户
 *
 * @author yuyonghua
 * @date 2019/6/28 16:46
 */
@Data
@Document(collection = "sys_user")
public class UserDomain {

    /**
     * 主键ID
     */
    @Id
    private String id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private int age;
}
