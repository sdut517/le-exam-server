package com.leexam.service.impl;

import com.leexam.entity.User;
import com.leexam.mapper.OrgMapper;
import com.leexam.mapper.UserMapper;
import com.leexam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    OrgMapper orgMapper;

    @Override
    public String login(String uname, String pwd) {
        if (userMapper.loginByUname(uname, pwd) != null || userMapper.loginByEmail(uname, pwd) != null) {
            return "success";
        }
        return "failed";
    }

    @Override
    public String register(String uname, String pwd, String email, String oname, String name, String phone) {
        if(userMapper.selectByEmail(email)==null && userMapper.selectByUname(uname)==null) {
           int oid = orgMapper.selectOidByOname(oname);
            userMapper.insert(uname,oid, email, phone, name, pwd);
            return "success";
        }

        return "failed";
    }

    @Override
    public String updateuser(String name, String phone) {
        userMapper.updateByname(name,phone);
        return "seccess";
    }

    @Override
    public String insertmoreuser(String uname, String email, String name, int pid, String pwd) {
        int oid=userMapper.selectOidByUname(uname);
        userMapper.insertMore(oid,email,name,pid,pwd);
        return "seccess";
    }

    @Override
    public String updatePwd(String name, String pwd) {
        String oldpwd=userMapper.
        return null;
    }
}
