package com.leexam.entity;

/**
*@author 窦康泰
*@date 2021/01/05
*/
/**
    * 用户表
    */
public class User {
    /**
    * 编号
    */
    private Integer uid;

    /**
    * 用户名
    */
    private String uname;

    /**
    * 机构编号
    */
    private Integer oid;

    /**
    * 邮箱
    */
    private String email;

    /**
    * 手机号
    */
    private String phone;

    /**
    * 姓名
    */
    private String name;

    /**
    * 权限编号
    */
    private Integer pid;

    /**
    * 密码
    */
    private String pwd;

    /**
    * 激活状态
    */
    private Integer status;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}