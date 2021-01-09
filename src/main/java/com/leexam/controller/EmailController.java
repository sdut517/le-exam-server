package com.leexam.controller;

import com.leexam.utils.EmailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.TemplateEngine;

/**
 * @author 窦康泰
 * @date 2021/01/08
 */
@RestController
public class EmailController {

    @Autowired
    EmailUtil emailUtil;

    @RequestMapping("email")
    public String sendSimpleEmail(String toUsername, String title, String content) {
        return emailUtil.sendEmail(toUsername, title, content);
    }

}
