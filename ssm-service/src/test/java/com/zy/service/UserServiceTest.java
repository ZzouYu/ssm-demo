package com.zy.service;

import com.zy.domain.User;
import com.zy.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UserServiceTest {

    @Test
    public void findUserInfo() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/springContext-service.xml");
        UserService userService = context.getBean(UserServiceImpl.class);
        List<User> userInfoById = userService.findUserInfo();
        System.out.println(userInfoById);
    }
}