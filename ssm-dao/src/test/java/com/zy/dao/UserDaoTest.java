package com.zy.dao;

import com.zy.domain.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


public class UserDaoTest {
    @Test
    public void findUserInfoById() {

      ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/springContext-dao.xml");
        UserDao userDao = context.getBean(UserDao.class);
        List<User> userInfoById = userDao.findUserInfo();
       System.out.println(userInfoById);
    }
}
