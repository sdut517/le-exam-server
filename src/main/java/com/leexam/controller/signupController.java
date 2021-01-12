package com.leexam.controller;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.leexam.entity.Signup;
import com.leexam.mapper.SignupMapper;
import com.leexam.service.SignupService;
import org.mybatis.logging.Logger;
import org.mybatis.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.xml.ws.Response;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import static javax.print.attribute.Size2DSyntax.MM;

@RestController
public class signupController {
    @Autowired
    SignupService signupService;

    @PostMapping("/addsignup")
    String addsignup(
            @RequestParam("sname") String sname,
            @RequestParam("sdesc") String sdesc,
            @RequestParam("banner") String banner,
            @RequestParam("is_verify") Integer is_verify,
            @RequestParam("collect_info") String collect_info,
            @RequestParam("start_time") Date start_time,
            @RequestParam("end_time") Date end_time,
            @RequestParam("url") String url,
             @RequestParam("oid") Integer oid
            ){
        return signupService.inster(sname,banner,start_time,end_time,sdesc,is_verify,oid,url,collect_info);
    }

    @PostMapping("/updatesignup")
    String updatesignup(
            @RequestParam("banner") String banner,
            @RequestParam("sname") String sname,
            @RequestParam("new_sname") String new_sname,
            @RequestParam("start_time") @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date start_time,
            @RequestParam("end_time") @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date end_time,
            @RequestParam("sdesc") String sdesc,
            @RequestParam("is_verify") Integer is_verify
    ){
        return signupService.updateBySname(banner,sname,new_sname, start_time, end_time, sdesc, is_verify);
    }

    @PostMapping("/selectsignup")
    List<Signup> selectsignup(
            @RequestParam("oid") Integer oid
    ){
        return signupService.selectSignupByOid(oid);
    }



}
