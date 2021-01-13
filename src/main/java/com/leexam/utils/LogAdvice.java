package com.leexam.utils;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.leexam.entity.User;
import com.leexam.mapper.LogMapper;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;

@Aspect
@Component
public class LogAdvice {

    @Autowired
    LogMapper logMapper;


    private static final Logger logger = LoggerFactory.getLogger(LogAdvice.class);
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    private final String POINT_CUT = "execution(* com.leexam.controller.*.*(..))";

    @Pointcut(POINT_CUT)
    public void pointCut(){}

    @After(value = POINT_CUT)
    public void doAfterAdvice(JoinPoint joinPoint){
        ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
        HttpSession session = attr.getRequest().getSession(true);
        String uname = (String) session.getAttribute("username");
        System.out.println(uname);

        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss ");
        System.out.println("格式化输出：" + d);

        Signature signature = joinPoint.getSignature();
        String u =  signature.getName();
        if(u.equals("login")) {
            logMapper.insert(1, "操作员登录", uname, d);
        }else if(u.equals("updatepwd")) {
            logMapper.insert(2, "操作员修改密码", uname, d);
        }else if(u.equals("insertMoreUser")) {
            logMapper.insert(3, "操作员增加用户", uname, d);
        }else if(u.equals("updateUser")) {
            logMapper.insert(4, "操作员修改个人信息", uname, d);
        }else if(u.equals("updateorg")) {
            logMapper.insert(5, "操作员更改组织信息", uname, d);
        }else if(u.equals("addsignup")) {
            logMapper.insert(6, "操作员创建报名", uname, d);
        }else if(u.equals("updatesignup")) {
            logMapper.insert(7, "操作员修改报名信息", uname, d);
        }else if(u.equals("sendSimpleEmail")) {
            logMapper.insert(8, "操作员发送邮件", uname, d);
        }
        else if(u.equals("insertSelective")) {
            logMapper.insert(9, "操作员新建考试", uname, d);
        }
        else if(u.equals("deleteByPrimaryKey")) {
            logMapper.insert(10, "操作员删除考试", uname, d);
        }else if(u.equals("updateByPrimaryKeySelective")) {
            logMapper.insert(11, "操作员修改考试信息", uname, d);
        }
    }

}
