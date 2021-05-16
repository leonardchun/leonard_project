package com.leonard.mysql.service.impl;

import com.leonard.mysql.service.UserService;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest extends TestCase {

    @Autowired
    private UserService userService;

    @Test
    public void testInserUser() {

        userService.inserUser("春",30);
    }
}