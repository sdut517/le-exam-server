package com.leexam.entity;

/**
    * 单元表
    */
public class Unit {
    @Override
    public String toString() {
        return "Unit{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", descTitle='" + descTitle + '\'' +
                ", descBody='" + descBody + '\'' +
                ", isOutOfOrder1=" + isOutOfOrder1 +
                ", isOutOfOrder2=" + isOutOfOrder2 +
                ", isBanTurnOver=" + isBanTurnOver +
                ", atLeastTime=" + atLeastTime +
                ", limitTime=" + limitTime +
                ", fullMarks=" + fullMarks +
                ", questions='" + questions + '\'' +
                '}';
    }

    /**
    * 单元编号
    */
    private Integer uid;

    /**
    * 单元名
    */
    private String uname;

    /**
    * 单元说明标题
    */
    private String descTitle;

    /**
    * 单元说明内容
    */
    private String descBody;

    /**
    * 是否题目乱序
    */
    private Integer isOutOfOrder1;

    /**
    * 是否选项乱序
    */
    private Integer isOutOfOrder2;

    /**
    * 是否禁止翻题
    */
    private Integer isBanTurnOver;

    /**
    * 至少时间
    */
    private Integer atLeastTime;

    /**
    * 限时时间
    */
    private Integer limitTime;

    /**
    * 总分
    */
    private Integer fullMarks;

    /**
    * 大题json
    */
    private String questions;

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

    public String getDescTitle() {
        return descTitle;
    }

    public void setDescTitle(String descTitle) {
        this.descTitle = descTitle;
    }

    public String getDescBody() {
        return descBody;
    }

    public void setDescBody(String descBody) {
        this.descBody = descBody;
    }

    public Integer getIsOutOfOrder1() {
        return isOutOfOrder1;
    }

    public void setIsOutOfOrder1(Integer isOutOfOrder1) {
        this.isOutOfOrder1 = isOutOfOrder1;
    }

    public Integer getIsOutOfOrder2() {
        return isOutOfOrder2;
    }

    public void setIsOutOfOrder2(Integer isOutOfOrder2) {
        this.isOutOfOrder2 = isOutOfOrder2;
    }

    public Integer getIsBanTurnOver() {
        return isBanTurnOver;
    }

    public void setIsBanTurnOver(Integer isBanTurnOver) {
        this.isBanTurnOver = isBanTurnOver;
    }

    public Integer getAtLeastTime() {
        return atLeastTime;
    }

    public void setAtLeastTime(Integer atLeastTime) {
        this.atLeastTime = atLeastTime;
    }

    public Integer getLimitTime() {
        return limitTime;
    }

    public void setLimitTime(Integer limitTime) {
        this.limitTime = limitTime;
    }

    public Integer getFullMarks() {
        return fullMarks;
    }

    public void setFullMarks(Integer fullMarks) {
        this.fullMarks = fullMarks;
    }

    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }
}