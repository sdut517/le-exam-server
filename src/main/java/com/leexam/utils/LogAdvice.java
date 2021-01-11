package com.leexam.utils;


import com.fasterxml.jackson.databind.ObjectMapper;
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
        System.out.println("qiemian");
        Signature signature = joinPoint.getSignature();
        String u =  signature.getName();
        if(u.equals("login")) {
//            logMapper.insert(1,"操作员登录",);



        }
    }

}
