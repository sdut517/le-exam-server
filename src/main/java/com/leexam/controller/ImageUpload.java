package com.leexam.controller;

import com.leexam.utils.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author 窦康泰
 * @date 2021/01/08
 */
@RestController
public class ImageUpload {

    @Autowired
    FileUtil fileUtil;

    @RequestMapping("/upload")
    public String upload(@RequestParam("img") MultipartFile imgFile) {
        String path = fileUtil.upload(imgFile);
        return "images/" + path;
    }

}
