package com.leexam.entity;

import java.util.Date;

/**
*@author 窦康泰
*@date 2021/01/05
*/
/**
    * 考生报名表
    */
public class SignupDo {
    /**
    * 编号
    */
    private Integer sdid;

    /**
    * 考生编号
    */
    private Integer eeid;

    /**
    * 报名编号
    */
    private Integer sid;

    /**
    * 报名时间
    */
    private Date time;

    public Integer getSdid() {
        return sdid;
    }

    public void setSdid(Integer sdid) {
        this.sdid = sdid;
    }

    public Integer getEeid() {
        return eeid;
    }

    public void setEeid(Integer eeid) {
        this.eeid = eeid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}