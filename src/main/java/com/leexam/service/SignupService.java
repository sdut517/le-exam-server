package com.leexam.service;

import com.leexam.entity.Signup;

import java.util.Date;
import java.util.List;

public interface SignupService {
    String inster(String sname,String banner, Date start_time, Date end_time, String sdesc, Integer is_verify, Integer oid, String url, String collect_info);
    String updateBanner(String sname,String banner);
    String updateBySname(String sname,String new_sname,Date start_time,Date end_time,String sdesc,Integer is_verify);
    List<Signup> selectSignupByOid(Integer oid);
}
