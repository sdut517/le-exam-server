package com.leexam.service;

import com.leexam.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserService {

    String login(String uname, String pwd);
    String register(String uname,String pwd,String email,String oname,String name,String phone);
    String updateUser(int uid,String phone,String new_name);
    String insertMoreUser(String uname, String email, String name,int pid, String pwd);
    String updatePwd(int uid,String new_pwd,String enter_pwd);
    List<User> selectAllByUname(String uname);
    String selectUnameByEmail(String email);
}
