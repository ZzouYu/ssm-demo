package com.zy.service.impl;

import com.zy.dao.UserDao;
import com.zy.domain.User;
import com.zy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zouyu
 * @description
 * @date 2020/4/23
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public List<User> findUserInfo() {
        return userDao.findUserInfo();
    }
}
