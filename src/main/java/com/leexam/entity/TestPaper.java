package com.leexam.entity;

import java.util.Date;

/**
    * 试卷表
    */
public class TestPaper {
    /**
    * 试卷编号
    */
    private Integer tpid;

    /**
    * 试卷名称
    */
    private String tpname;

    /**
    * 试卷描述
    */
    private String tpdesc;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 更新时间
    */
    private Date updateTime;

    /**
    * 至少时间
    */
    private Date atLeastTime;

    /**
    * 限时时间
    */
    private Date limitTime;

    /**
    * 满分分数
    */
    private Integer fullMarks;

    /**
    * 考生须知（标题）
    */
    private String notesTitle;

    /**
    * 考试须知（内容）
    */
    private String notesBody;

    /**
    * 单元（json）
    */
    private String unit;

    public Integer getTpid() {
        return tpid;
    }

    public void setTpid(Integer tpid) {
        this.tpid = tpid;
    }

    public String getTpname() {
        return tpname;
    }

    public void setTpname(String tpname) {
        this.tpname = tpname;
    }

    public String getTpdesc() {
        return tpdesc;
    }

    public void setTpdesc(String tpdesc) {
        this.tpdesc = tpdesc;
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

    public Date getAtLeastTime() {
        return atLeastTime;
    }

    public void setAtLeastTime(Date atLeastTime) {
        this.atLeastTime = atLeastTime;
    }

    public Date getLimitTime() {
        return limitTime;
    }

    public void setLimitTime(Date limitTime) {
        this.limitTime = limitTime;
    }

    public Integer getFullMarks() {
        return fullMarks;
    }

    public void setFullMarks(Integer fullMarks) {
        this.fullMarks = fullMarks;
    }

    public String getNotesTitle() {
        return notesTitle;
    }

    public void setNotesTitle(String notesTitle) {
        this.notesTitle = notesTitle;
    }

    public String getNotesBody() {
        return notesBody;
    }

    public void setNotesBody(String notesBody) {
        this.notesBody = notesBody;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}