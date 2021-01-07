package com.leexam.entity;

/**
    * 机构表
    */
public class Org {
    /**
    * 编号
    */
    private Integer oid;

    /**
    * 机构名称
    */
    private String oname;

    /**
    * 机构类型
    */
    private Integer type;

    /**
    * 网站URL
    */
    private String url;

    /**
    * 机构logo
    */
    private String logo;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        this.oname = oname;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}