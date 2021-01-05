package com.leexam.service;

import com.leexam.entity.User;

public interface UserService {

    String login(String uname, String pwd);
    String register(String uname,String pwd,String email,String oname,String name,String phone);
}
