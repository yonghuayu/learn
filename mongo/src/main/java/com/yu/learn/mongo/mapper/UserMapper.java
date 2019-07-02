package com.yu.learn.mongo.mapper;

import com.yu.learn.mongo.domain.UserDomain;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * user repository
 *
 * @author yuyonghua
 * @date 2019/6/28 16:47
 */
public interface UserMapper extends MongoRepository<UserDomain, String> {

    /**
     * 根据名称查询
     *
     * @param name 名称
     * @return list
     */
    List<UserDomain> findAllByName(String name);
}
