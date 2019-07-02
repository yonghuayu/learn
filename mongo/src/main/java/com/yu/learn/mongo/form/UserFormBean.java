package com.yu.learn.mongo.form;

import com.yu.learn.global.web.group.IAddGroup;
import com.yu.learn.global.web.group.IModifyGroup;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

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
    @NotBlank(groups = IModifyGroup.class)
    private String id;

    /**
     * 姓名
     */
    @NotBlank(groups = IAddGroup.class)
    private String name;

    /**
     * 年龄
     */
    @NotNull(groups = IAddGroup.class)
    @Max(value = 150, groups = IAddGroup.class)
    @Min(value = 0, groups = IAddGroup.class)
    private int age;
}
