package com.leexam.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.internet.MimeMessage;

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

    public String sendHtmlEmail(String toUsername, String title, String htmlContent) {
        MimeMessage message = null;
        try {
            message = jms.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom(from);
            helper.setTo(toUsername);
            helper.setSubject(title);
            StringBuffer sb = new StringBuffer(htmlContent);
            helper.setText(sb.toString(), true);
            jms.send(message);
            return "success";
        } catch (Exception e) {
            return "error";
        }
    }

}
