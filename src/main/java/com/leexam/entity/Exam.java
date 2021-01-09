package com.leexam.entity;

import java.util.Date;
import java.util.List;

/**
    * 考试表
    */
public class Exam {
    private List<Examinee> examineeList;

    public List<Examinee> getExamineeList() {
        return examineeList;
    }

    public void setExamineeList(List<Examinee> examineeList) {
        this.examineeList = examineeList;
    }

    private List<TestPaper> testPaperList;

    public List<TestPaper> getTestPaperList() {
        return testPaperList;
    }

    public void setTestPaperList(List<TestPaper> testPaperList) {
        this.testPaperList = testPaperList;
    }

    /**
    * 考试编号
    */
    private Integer eid;

    /**
    * 考试名称
    */
    private String ename;

    /**
    * 开始时间
    */
    private Date startTime;

    /**
    * 结束时间
    */
    private Date endTime;

    /**
    * 提前登录
    */
    private Integer loginInAdvance;

    /**
    * 限制登录
    */
    private Integer restrictedLogin;

    /**
    * 欢迎语
    */
    private String welcomeMsg;

    /**
    * 试卷json
    */
    private String testPaper;

    /**
    * 个人信息json
    */
    private String personalInfo;

    /**
    * 即报即考
    */
    private Integer eSignUp;

    /**
    * 练习模式
    */
    private Integer ePracticeMode;

    /**
    * 考试承诺书
    */
    private Integer eOmmitment;

    /**
    * 考试承诺书内容
    */
    private String eOmmitmentBody;

    /**
    * 锁定考试
    */
    private Integer eLockedExam;

    /**
    * 查看成绩
    */
    private Integer eViewResults;

    /**
    * 考试地址
    */
    private String url;

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
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

    public Integer getLoginInAdvance() {
        return loginInAdvance;
    }

    public void setLoginInAdvance(Integer loginInAdvance) {
        this.loginInAdvance = loginInAdvance;
    }

    public Integer getRestrictedLogin() {
        return restrictedLogin;
    }

    public void setRestrictedLogin(Integer restrictedLogin) {
        this.restrictedLogin = restrictedLogin;
    }

    public String getWelcomeMsg() {
        return welcomeMsg;
    }

    public void setWelcomeMsg(String welcomeMsg) {
        this.welcomeMsg = welcomeMsg;
    }

    public String getTestPaper() {
        return testPaper;
    }

    public void setTestPaper(String testPaper) {
        this.testPaper = testPaper;
    }

    public String getPersonalInfo() {
        return personalInfo;
    }

    public void setPersonalInfo(String personalInfo) {
        this.personalInfo = personalInfo;
    }

    public Integer geteSignUp() {
        return eSignUp;
    }

    public void seteSignUp(Integer eSignUp) {
        this.eSignUp = eSignUp;
    }

    public Integer getePracticeMode() {
        return ePracticeMode;
    }

    public void setePracticeMode(Integer ePracticeMode) {
        this.ePracticeMode = ePracticeMode;
    }

    public Integer geteOmmitment() {
        return eOmmitment;
    }

    public void seteOmmitment(Integer eOmmitment) {
        this.eOmmitment = eOmmitment;
    }

    public String geteOmmitmentBody() {
        return eOmmitmentBody;
    }

    public void seteOmmitmentBody(String eOmmitmentBody) {
        this.eOmmitmentBody = eOmmitmentBody;
    }

    public Integer geteLockedExam() {
        return eLockedExam;
    }

    public void seteLockedExam(Integer eLockedExam) {
        this.eLockedExam = eLockedExam;
    }

    public Integer geteViewResults() {
        return eViewResults;
    }

    public void seteViewResults(Integer eViewResults) {
        this.eViewResults = eViewResults;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}