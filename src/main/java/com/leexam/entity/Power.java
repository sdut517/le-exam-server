package com.leexam.entity;

/**
    * 权限表
    */
public class Power {
    /**
    * 编号
    */
    private Integer pid;

    /**
    * 身份
    */
    private String pname;

    /**
    * 权限内容
    */
    private Integer power;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }
}