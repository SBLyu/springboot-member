package com.sblyu.springbootmember.dao;

import com.sblyu.springbootmember.dto.UserRegisterRequest;
import com.sblyu.springbootmember.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    User getUserByEmail(String email);
    Integer createUser(UserRegisterRequest userRegisterRequest);
}
