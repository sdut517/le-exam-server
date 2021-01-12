package com.leexam.service.impl;

import com.leexam.mapper.SignupDoMapper;
import com.leexam.service.SignupDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 窦康泰
 * @date 2021/01/11
 */
@Service
public class SignupDoServiceImpl implements SignupDoService {

    @Autowired
    SignupDoMapper signupDoMapper;

    @Override
    public int selectCountToday(Integer oid) {
        return signupDoMapper.selectCountToday(oid);
    }

    @Override
    public int selectCountSum(Integer oid) {
        return signupDoMapper.selectCountSum(oid);
    }
}
