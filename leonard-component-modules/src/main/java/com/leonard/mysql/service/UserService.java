package com.leonard.mysql.service;

/**
 * 数据库测试类
 */
public interface UserService {

    /**
     * 插入数据库
     * @param name
     * @param age
     * @return
     */
    Boolean inserUser(String name, Integer age);
}
