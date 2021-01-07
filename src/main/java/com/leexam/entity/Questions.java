package com.leexam.entity;

/**
    * 大题表
    */
public class Questions {
    /**
    * 大题编号
    */
    private Integer qsid;

    /**
    * 大题名称
    */
    private String qsname;

    /**
    * 大题说明标题
    */
    private String descTitle;

    /**
    * 大题说明内容
    */
    private String descBody;

    /**
    * 题目json
    */
    private String question;

    public Integer getQsid() {
        return qsid;
    }

    public void setQsid(Integer qsid) {
        this.qsid = qsid;
    }

    public String getQsname() {
        return qsname;
    }

    public void setQsname(String qsname) {
        this.qsname = qsname;
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

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}