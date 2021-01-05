package com.leexam.controller;

import com.leexam.entity.User;
import com.leexam.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

    @RequestMapping(value = {"/", "/index"})
    public String index() {
        return "index";
    }

    @Autowired
    UserMapper userMapper;

    @RequestMapping(value = {"/test"})
    @ResponseBody
    public Integer test() {
        User user = userMapper.selectByPrimaryKey(1);
        return user.getPid();
    }
}
