package com.leexam.entity;

/**
    * 题目表
    */
public class Question {
    /**
    * 题目编号
    */
    private Integer qid;

    /**
    * 题目类型
    */
    private String qtype;

    /**
    * 题号
    */
    private Integer qnumber;

    /**
    * 题干
    */
    private String qstem;

    /**
    * 答案json
    */
    private String qans;

    /**
    * 题目分析
    */
    private String analysis;

    /**
    * 题目分值
    */
    private Integer points;

    /**
    * 填空题答案乱序
    */
    private Integer outOfOrder;

    /**
    * 选项json
    */
    private String options;

    /**
    * 难度
    */
    private Integer difficult;

    /**
    * 标签
    */
    private String tag;

    public Integer getQid() {
        return qid;
    }

    public void setQid(Integer qid) {
        this.qid = qid;
    }

    public String getQtype() {
        return qtype;
    }

    public void setQtype(String qtype) {
        this.qtype = qtype;
    }

    public Integer getQnumber() {
        return qnumber;
    }

    public void setQnumber(Integer qnumber) {
        this.qnumber = qnumber;
    }

    public String getQstem() {
        return qstem;
    }

    public void setQstem(String qstem) {
        this.qstem = qstem;
    }

    public String getQans() {
        return qans;
    }

    public void setQans(String qans) {
        this.qans = qans;
    }

    public String getAnalysis() {
        return analysis;
    }

    public void setAnalysis(String analysis) {
        this.analysis = analysis;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Integer getOutOfOrder() {
        return outOfOrder;
    }

    public void setOutOfOrder(Integer outOfOrder) {
        this.outOfOrder = outOfOrder;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public Integer getDifficult() {
        return difficult;
    }

    public void setDifficult(Integer difficult) {
        this.difficult = difficult;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}