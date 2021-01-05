package com.leexam.entity;

import java.util.Date;

/**
*@author 窦康泰
*@date 2021/01/05
*/
/**
    * 题库表
    */
public class QuesBank {
    /**
    * 编号
    */
    private Integer qbid;

    /**
    * 题库名称
    */
    private String qbname;

    /**
    * 题目json
    */
    private String question;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 更新时间
    */
    private Date updateTime;

    /**
    * 组织编号
    */
    private Integer oid;

    public Integer getQbid() {
        return qbid;
    }

    public void setQbid(Integer qbid) {
        this.qbid = qbid;
    }

    public String getQbname() {
        return qbname;
    }

    public void setQbname(String qbname) {
        this.qbname = qbname;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }
}