package com.leexam.entity;

public class Response {

    private String result;//API返回码
    private String content;//API返回数据

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
