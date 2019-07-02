package com.yu.learn.global.service;

import java.io.Serializable;
import java.util.List;

/**
 * 全局service
 *
 * @author yuyonghua
 * @date 2019/7/2 11:24
 */
public interface IGlobalService<T extends Serializable> {

    /**
     * 新增
     *
     * @param t 对象
     * @return 主键ID
     */
    String add(T t);

    /**
     * 修改
     *
     * @param t 对象
     * @return 修改结果描述信息
     */
    String modify(T t);

    /**
     * 根据主键ID批量删除
     *
     * @param ids 主键ID集合
     * @return 受删除影响的记录数量
     */
    int removeByIds(List<String> ids);

    /**
     * 查询所有
     *
     * @return list
     */
    List<T> listAll();

    /**
     * 查询符合条件的列表
     *
     * @param t 对象
     * @return list
     */
    List<T> list(T t);
}
