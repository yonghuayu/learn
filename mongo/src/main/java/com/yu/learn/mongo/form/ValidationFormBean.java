package com.yu.learn.mongo.form;

import com.yu.learn.global.web.group.IAddGroup;
import com.yu.learn.global.web.group.IModifyGroup;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * 〈功能简述〉
 *
 * @author yuyonghua
 * @date 2019/7/5 15:31
 */
@Data
public class ValidationFormBean {

    /**
     * msg
     */
    @NotBlank(groups = IAddGroup.class)
    private String msg;

    /**
     * list
     */
    @NotEmpty(groups = IModifyGroup.class)
    private List<String> list;

    /**
     * list
     */
    @NotNull
    private int number;
}
