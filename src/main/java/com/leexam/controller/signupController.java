package com.leexam.controller;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.leexam.mapper.SignupMapper;
import com.leexam.service.SignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.xml.ws.Response;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;

import static javax.print.attribute.Size2DSyntax.MM;

@RestController
public class signupController {
    @Autowired
    SignupService signupService;

    @PostMapping("/addsignup")
    String addsignup(
            @RequestParam("sname") String sname,
            @RequestParam("banner") String banner,
            @RequestParam("sdesc") String sdesc,
            @RequestParam("is_verify") Integer is_verify,
            @RequestParam("collect_info") String collect_info,
            @RequestParam("start_time") Date start_time,
            @RequestParam("end_time") Date end_time,
            @RequestParam("url") String url,
             @RequestParam("oid") Integer oid
            ){
        return signupService.inster(sname,start_time,end_time,banner,sdesc,is_verify,oid,url,collect_info);
    }

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    String upload(@RequestParam("uploadFile") MultipartFile uploadFile) throws IOException {
        if (null == uploadFile) {
            return "上传失败，无法找到文件！";
        }
        // BMP、JPG、JPEG、PNG、GIF
        String fileName = uploadFile.getOriginalFilename().toLowerCase();
        if (!fileName.endsWith(".bmp") && !fileName.endsWith(".jpg")
                && !fileName.endsWith(".jpeg") && !fileName.endsWith(".png")
                && !fileName.endsWith(".gif")) {
            return "上传失败，请选择BMP、JPG、JPEG、PNG、GIF文件！";
        }
        //逻辑处理
        return "成功";
    }


}
