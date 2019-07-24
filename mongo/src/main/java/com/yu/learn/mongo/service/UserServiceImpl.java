package com.yu.learn.mongo.service;

import com.yu.learn.mongo.domain.UserDomain;
import com.yu.learn.mongo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * 〈功能简述〉
 *
 * @author yuyonghua
 * @date 2019/6/28 16:46
 */
@Service
public class UserServiceImpl implements UserService {

    /**
     * user mapper
     */
    @Lazy
    @Autowired
    private UserMapper userMapper;

    /**
     * 新增
     *
     * @param userDomain user
     * @return 主键ID
     */
    @Override
    public String add(@NotNull UserDomain userDomain) {
        userMapper.insert(userDomain);
        return userDomain.getId();
    }

    /**
     * 根据名称查询列表
     *
     * @param name 名称
     * @return list
     */
    @Override
    public List<UserDomain> findByName(@NotBlank String name) {
        return userMapper.findAllByName(name);
    }
}
