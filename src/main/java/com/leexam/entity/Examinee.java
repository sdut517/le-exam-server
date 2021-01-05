package com.leexam.entity;

import java.util.Date;

/**
*@author 窦康泰
*@date 2021/01/05
*/
/**
    * 考生表
    */
public class Examinee {
    /**
    * 考生编号
    */
    private Integer eeid;

    /**
    * 考生状态
    */
    private Integer status;

    /**
    * 准考证号
    */
    private String number;

    /**
    * 姓名
    */
    private String name;

    /**
    * 考试编号
    */
    private Integer eid;

    /**
    * 邮箱
    */
    private String email;

    /**
    * 手机号
    */
    private String phone;

    /**
    * 性别
    */
    private Integer gender;

    /**
    * 身份证号
    */
    private String id;

    /**
    * 登陆时间
    */
    private Date loginTime;

    /**
    * 邮件通知
    */
    private Integer isEmail;

    /**
    * 成绩
    */
    private Double grade;

    /**
    * 是否判分
    */
    private Integer isScore;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 完成时间
    */
    private Date finishTime;

    /**
    * 考试用时秒数
    */
    private Integer costTime;

    /**
    * 密码
    */
    private String pwd;

    public Integer getEeid() {
        return eeid;
    }

    public void setEeid(Integer eeid) {
        this.eeid = eeid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Integer getIsEmail() {
        return isEmail;
    }

    public void setIsEmail(Integer isEmail) {
        this.isEmail = isEmail;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    public Integer getIsScore() {
        return isScore;
    }

    public void setIsScore(Integer isScore) {
        this.isScore = isScore;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public Integer getCostTime() {
        return costTime;
    }

    public void setCostTime(Integer costTime) {
        this.costTime = costTime;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}