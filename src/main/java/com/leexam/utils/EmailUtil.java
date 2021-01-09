package com.leexam.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

/**
 * @author 窦康泰
 * @date 2021/01/08
 */
@Component
public class EmailUtil {

    @Autowired
    private JavaMailSender jms;

    @Value("${spring.mail.username}")
    private String from;

    public String sendEmail(String toUsername, String title, String content) {
        try {
            SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
            simpleMailMessage.setFrom(from);
            simpleMailMessage.setTo(toUsername);
            simpleMailMessage.setSubject(title);
            simpleMailMessage.setText(content);
            jms.send(simpleMailMessage);
            return "success";
        } catch (MailException e) {
            return "error";
        }
    }

}
