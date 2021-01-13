package com.leexam.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;


/**
    * 日志表
    */
public class Log {
    /**
    * 编号
    */
    private Integer lid;

    /**
    * 日志类型
    */
    private Integer type;

    /**
    * 日志名称
    */
    private String lname;

    /**
    * 日志内容
    */
    private String lbody;

    /**
    * 发生时间
    */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Shanghai")
    private Date ltime;

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getLbody() {
        return lbody;
    }

    public void setLbody(String lbody) {
        this.lbody = lbody;
    }

    public Date getLtime() {
        return ltime;
    }

    public void setLtime(Date ltime) {
        this.ltime = ltime;
    }
}