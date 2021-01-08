package com.leexam.controller;

import com.leexam.entity.User;
import com.leexam.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
public class PageController {

    @RequestMapping(value = {"/", "/index"})
    public String index() {
        return "index";
    }

    @Autowired
    UserMapper userMapper;

    @PostMapping(value = {"/test"})
    @ResponseBody
    public Integer test(@RequestParam Date date) {
        System.out.println(date);
        return 111;
    }
}
