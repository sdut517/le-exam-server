package com.leexam.service.impl;

import com.leexam.entity.User;
import com.leexam.mapper.UserMapper;
import com.leexam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public String login(String uname, String pwd) {
        if (userMapper.loginByUname(uname, pwd) != null || userMapper.loginByEmail(uname, pwd) != null) {
            return "success";
        }
        return "failed";
    }

    @Override
    public String register(String uname, String pwd, String email, String oname, String name, String phone) {
        return null;
    }
}
