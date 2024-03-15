package com.sblyu.springbootmember.service.impl;

import com.sblyu.springbootmember.dao.UserDao;
import com.sblyu.springbootmember.dto.UserRegisterRequest;
import com.sblyu.springbootmember.model.User;
import com.sblyu.springbootmember.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
