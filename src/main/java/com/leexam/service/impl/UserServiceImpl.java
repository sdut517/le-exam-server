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
        if (userMapper.selectByEmail(email) == null && userMapper.selectByUname(uname) == null) {
            int oid = orgMapper.selectOidByOname(oname);
            int i= userMapper.insert(uname, oid, email, phone, name, pwd);
            if(i!=0) {
                return "success";
            }
            else {
                return "failed";
            }
        }

        return "failed";
    }

    @Override
    public String updateUser(int uid, String phone,String new_name) {
        int i=userMapper.updateByname(uid, phone,new_name);
        if(i!=0){
            return "seccess";
        }
        else
            {
                return "failed";
            }
    }

    @Override
    public String insertMoreUser(String uname, String email, String name, int pid, String pwd) {
        int oid = userMapper.selectOidByUname(uname);
        int i=userMapper.insertMore(oid, email, name, pid, pwd);
        if(i!=0) {
            return "seccess";
        }
        else {
            return "failde";
        }
    }

    @Override
    public String updatePwd(int uid, String new_pwd,String enter_pwd) {
        String oldpwd = userMapper.selectPwdById(uid);
        if(oldpwd.equals(enter_pwd)){
            int i = userMapper.updatePwd(uid, new_pwd);
            if (i != 0) {
                return "success";
            } else {
                return "failed";
            }
        }else {
            return "failed";
        }


    }
}