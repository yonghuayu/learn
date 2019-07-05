package com.yu.learn.mongo.form;

import lombok.Data;

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
    private String msg;

    /**
     * list
     */
    private List<String> list;

    /**
     * list
     */
    private int number;
}
