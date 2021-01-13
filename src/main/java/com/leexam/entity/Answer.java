package com.leexam.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
/**
    * 答题表
    */
public class Answer {
    /**
    * 编号
    */
    private Integer aid;

    /**
    * 考生编号
    */
    private Integer eeid;

    /**
    * 题目编号
    */
    private Integer qid;

    /**
    * 答案
    */
    private String ans;

    /**
    * 时间
    */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Shanghai")
    private Date time;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getEeid() {
        return eeid;
    }

    public void setEeid(Integer eeid) {
        this.eeid = eeid;
    }

    public Integer getQid() {
        return qid;
    }

    public void setQid(Integer qid) {
        this.qid = qid;
    }

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}