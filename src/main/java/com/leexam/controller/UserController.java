package com.leexam.controller;

import com.leexam.service.OrgService;
import com.leexam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    OrgService orgService;

    @PostMapping("/login")
    String login(
            @RequestParam("uname") String uname,
            @RequestParam("pwd") String pwd
    ) {
        pwd = DigestUtils.md5DigestAsHex(pwd.getBytes());
        return userService.login(uname, pwd);
    }

    @PostMapping("/register")
    String register(
            @RequestParam("uname") String uname,
            @RequestParam("pwd") String pwd,
            @RequestParam("email") String email,
            @RequestParam("oname") String oname,
            @RequestParam("name") String name,
            @RequestParam("phone") String phone
    ) {
        pwd = DigestUtils.md5DigestAsHex(pwd.getBytes());
        orgService.addOrg(oname);



        return "";
    }
}
