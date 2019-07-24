package xyz.index.first.service;

import org.springframework.stereotype.Service;

/**
 * 〈功能简述〉
 *
 * @author yuyonghua
 * @date 2019/7/24 15:48
 */
@Service
public class FirstServiceImpl implements FirstService {

    /**
     * say hello
     *
     * @param name name
     * @return message
     */
    @Override
    public String hello(String name) {
        return "Hello! " + name;
    }
}
