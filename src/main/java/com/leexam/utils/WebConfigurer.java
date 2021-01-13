//package com.leexam.utils;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//import java.io.File;
//
///**
// * @author 窦康泰
// * @date 2021/01/08
// */
//@Configuration
//public class WebConfigurer implements WebMvcConfigurer {
//
//    @Value("${web.upload-path}")
//    private String imagesPath;
//
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/upload/images/**").addResourceLocations("file:" + new File(imagesPath).getAbsolutePath() + "/");
//    }
//}
