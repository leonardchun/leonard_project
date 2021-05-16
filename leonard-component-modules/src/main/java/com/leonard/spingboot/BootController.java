package com.leonard.spingboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BootController {

    @Value("${leonard.username}")
    private String name;

    @Value("${leonard.age}")
    private String age;

    /**
     * 获取用户
     *
     * @return
     */
    @RequestMapping("/getUser")
    private String getUser() {
        return "姓名：" + name + "  年齡：" + age;
    }

}
