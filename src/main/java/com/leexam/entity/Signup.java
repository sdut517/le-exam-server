package com.leexam.entity;

import java.util.Date;

/**
*@author 窦康泰
*@date 2021/01/05
*/
public class Signup {
    /**
    * 报名编号
    */
    private Integer sid;

    /**
    * 报名名称
    */
    private String sname;

    /**
    * 报名海报
    */
    private String banner;

    /**
    * 报名描述
    */
    private String sdesc;

    /**
    * 是否需要验证
    */
    private Integer isVerify;

    /**
    * 收集信息json
    */
    private String collectInfo;

    /**
    * 开始时间
    */
    private Date startTime;

    /**
    * 结束时间
    */
    private Date endTime;

    /**
    * 机构编号
    */
    private Integer oid;

    /**
    * 地址
    */
    private String url;

    /**
    * 状态
    */
    private Integer status;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getSdesc() {
        return sdesc;
    }

    public void setSdesc(String sdesc) {
        this.sdesc = sdesc;
    }

    public Integer getIsVerify() {
        return isVerify;
    }

    public void setIsVerify(Integer isVerify) {
        this.isVerify = isVerify;
    }

    public String getCollectInfo() {
        return collectInfo;
    }

    public void setCollectInfo(String collectInfo) {
        this.collectInfo = collectInfo;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}