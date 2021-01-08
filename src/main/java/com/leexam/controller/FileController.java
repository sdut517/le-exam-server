package com.leexam.controller;

import com.leexam.service.OrgService;
import com.leexam.service.SignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.UUID;

@Controller
public class FileController {

    @Autowired
    OrgService orgService;
    @Autowired
    SignupService signupService;

    @PostMapping("/upload_logo")
    @ResponseBody
    public String upload_logo (
            @RequestParam("file") MultipartFile file,
            @RequestParam("uname") String uname
    ) {
//        String staticPath = this.getClass().getClassLoader().getResource("static").getFile();
        String path =System.getProperty("user.dir")+"\\src\\main\\resources\\static";

        System.out.println(path);
        // 获取原始名字
        String fileName = file.getOriginalFilename();
        // 获取后缀名
        // String suffixName = fileName.substring(fileName.lastIndexOf("."));
        // 文件保存路径
        String filePath = path+"/image/upload_logo/";
        // 文件重命名，防止重复
        fileName = filePath + UUID.randomUUID() + fileName;
        String str1 = fileName.substring(0,fileName.indexOf("/"));
        String filename = fileName.substring(str1.length()+1,fileName.length());
        // 文件对象
        File dest = new File(fileName);
        // 判断路径是否存在，如果不存在则创建
        if(!dest.getParentFile().exists()) {
            dest.getParentFile().mkdirs();
        }
        try {
            // 保存到服务器中
            file.transferTo(dest);
            orgService.updateOrgLogo(uname,filename);
            return filename;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Failed to upload logo";
    }

    @PostMapping("/upload_poster")
    @ResponseBody
    public String upload_poster(
            @RequestParam("file") MultipartFile file,
            @RequestParam("sname") String sname
    ) {
        String path =System.getProperty("user.dir")+"\\src\\main\\resources\\static";
        // 获取原始名字
        String fileName = file.getOriginalFilename();
        // 获取后缀名
        // String suffixName = fileName.substring(fileName.lastIndexOf("."));
        // 文件保存路径
        String filePath =path+"image/upload_poster/";
        // 文件重命名，防止重复
        fileName = filePath + UUID.randomUUID() + fileName;
        String str1 = fileName.substring(0,fileName.indexOf("/"));
        String filename = fileName.substring(str1.length()+1,fileName.length());
        // 文件对象
        File dest = new File(fileName);
        // 判断路径是否存在，如果不存在则创建
        if(!dest.getParentFile().exists()) {
            dest.getParentFile().mkdirs();
        }
        try {
            // 保存到服务器中
            file.transferTo(dest);
            signupService.updateBanner(sname,filename);
            return filename;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Failed to upload poster";
    }
}
