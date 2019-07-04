package com.yu.learn.mongo.form;

import com.yu.learn.global.web.group.IAddGroup;
import com.yu.learn.global.web.group.IModifyGroup;
import com.yu.learn.global.web.group.IRemoveGroup;
import lombok.Data;

import javax.validation.constraints.*;
import java.util.List;

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

    /**
     * 主键ID集合
     */
    @NotEmpty(groups = IRemoveGroup.class)
    private List<String> ids;
}
