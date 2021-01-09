package com.leexam.controller;

import com.leexam.entity.Org;
import com.leexam.entity.User;
import com.leexam.service.OrgService;
import com.leexam.service.UserService;
import org.apache.ibatis.annotations.Insert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
        return userService.register(uname, pwd, email, oname, name, phone);
    }

    @PostMapping("/selectorg")
    List<Org> selectorg(
            @RequestParam("uname") String uname
    ) {
       return  orgService.selectAllByUname(uname);
    }


    @PostMapping("/updateorg")
    String updateorg(
            @RequestParam("uname") String uname,
            @RequestParam("oname") String oname,
            @RequestParam("type") Integer type,
            @RequestParam("url") String url
    ){
       return orgService.updateOrg(uname,oname,type,url);

    }

    @PostMapping("/updateuser")
    String updateUser(
            @RequestParam("uid") int uid,
            @RequestParam("phone") String phone,
            @RequestParam("new_name") String new_name
    ){
        return userService.updateUser(uid, phone,new_name);
    }

    @PostMapping("/insertmoreuser")
    String insertMoreUser(
            @RequestParam("uname") String uname,
            @RequestParam("pid") Integer pid,
            @RequestParam("pwd") String pwd,
            @RequestParam("name") String name,
            @RequestParam("email") String email
    ){
        return userService.insertMoreUser(uname,email,name,pid,pwd);
    }


    @PostMapping("/updatepwd")
    String updatepwd(
            @RequestParam("uid") int uid,
            @RequestParam("new_pwd") String new_pwd,
            @RequestParam("enter_pwd") String enter_pwd
    ){
        return userService.updatePwd(uid, new_pwd,enter_pwd);
    }


    @PostMapping("/selectuser")
    List<User> selectuser(
            @RequestParam("uname") String uname
    ){
        return userService.selectAllByUname(uname);
    }

    @PostMapping("/selectUserByEmail")
    String selectUserByEmail(
            @RequestParam("email") String email
    ){
        return userService.selectUnameByEmail(email);
    }

}
