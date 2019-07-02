package com.yu.learn.mongo.form;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * user表单对象
 *
 * @author yuyonghua
 * @date 2019/7/2 11:05
 */
@Data
public class UserFormBean {

    /**
     * 主键ID
     */
    @NotBlank
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
