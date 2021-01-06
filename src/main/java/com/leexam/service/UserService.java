package com.leexam.service;

import com.leexam.entity.User;

public interface UserService {

    String login(String uname, String pwd);
    String register(String uname,String pwd,String email,String oname,String name,String phone);
    String updateuser(String name,String phone);
    String insertmoreuser(String uname, String email, String name,int pid, String pwd);
    String updatePwd(String name,String pwd);
}
