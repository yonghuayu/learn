package com.yu.learn.global.service;

import java.io.Serializable;
import java.util.List;

/**
 * 〈功能简述〉
 *
 * @author yuyonghua
 * @date 2019/7/2 11:30
 */
public class IGlobalServiceImpl<T extends Serializable> implements IGlobalService<T> {

    @Override
    public String add(T t) {
        return null;
    }

    @Override
    public String modify(T t) {
        return null;
    }

    @Override
    public int removeByIds(List<String> ids) {
        return 0;
    }

    @Override
    public List<T> listAll() {
        return null;
    }

    @Override
    public List<T> list(T t) {
        return null;
    }
}
