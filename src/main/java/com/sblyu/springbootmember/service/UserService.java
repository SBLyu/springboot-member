package com.sblyu.springbootmember.service;

import com.sblyu.springbootmember.dto.UserLoginRequest;
import com.sblyu.springbootmember.dto.UserRegisterRequest;
import com.sblyu.springbootmember.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);

    User login(UserLoginRequest userLoginRequest);
}
