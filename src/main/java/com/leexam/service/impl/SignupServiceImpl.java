package com.leexam.service.impl;

import com.leexam.mapper.SignupMapper;
import com.leexam.service.SignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class SignupServiceImpl implements SignupService {
    @Autowired
    SignupMapper signupMapper;

    @Override
    public String inster(String sname, Date start_time, Date end_time, String banner, String sdesc, Integer is_verify, Integer oid, String url, String collect_info) {
        return null;
    }
}