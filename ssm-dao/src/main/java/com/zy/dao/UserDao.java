package com.zy.dao;

import com.zy.domain.User;

import java.util.List;

public interface UserDao {

    public List<User> findUserInfo();
}
