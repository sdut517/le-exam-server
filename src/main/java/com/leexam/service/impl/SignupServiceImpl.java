package com.leexam.service.impl;


import com.leexam.entity.Signup;
import com.leexam.entity.SignupDo;
import com.leexam.mapper.SignupMapper;
import com.leexam.service.SignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class SignupServiceImpl implements SignupService {
    @Autowired
    SignupMapper signupMapper;

    @Override
    public String inster(String sname,String banner, Date start_time, Date end_time, String sdesc, Integer is_verify, Integer oid, String url, String collect_info) {
        int i=signupMapper.insert(sname,banner,start_time, end_time, sdesc, is_verify, oid, url, collect_info);
        if(i!=0){
            return "successfully added";
        }
        else {
            return "fail to add";
        }
    }

    @Override
    public String updateBanner(String sname, String banner) {
        int i =signupMapper.updateBanner(sname, banner);
        if(i!=0){
            return "successful upload";
        }
        else {
            return "successful upload";
        }
    }

    @Override
    public String updateBySname(String banner, String sname,String new_sname, Date start_time, Date end_time, String sdesc, Integer is_verify) {
        int i = signupMapper.updateBySname(banner,sname,new_sname, start_time, end_time, sdesc, is_verify);
        if(i!=0){
            return "modify successfully";
        }else {
            return "fail to modify";
        }
    }

    @Override
    public List<Signup> selectSignupByOid(Integer oid) {
        List<Signup> list_signup=signupMapper.selectSignupByOid(oid);
        System.out.println(list_signup);
        if(list_signup!=null){
            return list_signup;
        }else {
            return null;
        }
    }

    @Override
    public List<SignupDo> selectSignupDoByOid(Integer oid) {
        List<SignupDo> list_signupDo=signupMapper.selectSignupDoByOid(oid);
        if(list_signupDo!=null){
            return list_signupDo;
        }else {
            return null;
        }
    }
}
