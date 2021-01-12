package com.leexam.controller;

import com.leexam.service.SignupDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 窦康泰
 * @date 2021/01/11
 */
@RestController
@RequestMapping("SignupDo")
public class SignupDoController {

    @Autowired
    SignupDoService signupDoService;

    @GetMapping("/count/today")
    public int selectCountToday(Integer oid) {
        return signupDoService.selectCountToday(oid);
    }

    @GetMapping("/count")
    public int selectCountSum(Integer oid) {
        return signupDoService.selectCountSum(oid);
    }

}
