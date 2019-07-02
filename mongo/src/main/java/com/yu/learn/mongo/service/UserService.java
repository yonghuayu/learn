package com.yu.learn.mongo.service;

import com.yu.learn.mongo.domain.UserDomain;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * 〈功能简述〉
 *
 * @author yuyonghua
 * @date 2019/6/28 16:46
 */
public interface UserService {

    /**
     * 新增
     *
     * @param userDomain user
     * @return id
     */
    String add(@NotNull UserDomain userDomain);

    /**
     * 根据名称查询列表
     *
     * @param name 名称
     * @return list
     */
    List<UserDomain> findByName(@NotBlank String name);
}
