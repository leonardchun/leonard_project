package com.leonard.mysql.service.impl;

import com.leonard.mysql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * 数据库测试类
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 插入数据库
     *
     * @param name
     * @param age
     * @return
     */
    @Override
    public Boolean inserUser(String name, Integer age) {
        int update = jdbcTemplate.update("insert into leonard_user values(null,?,?);", name, age);
        return update > 0 ? true : false;
    }
}
