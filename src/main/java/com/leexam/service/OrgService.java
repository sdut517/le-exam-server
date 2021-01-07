package com.leexam.service;

import org.apache.ibatis.annotations.Select;

public interface OrgService {
    String addOrg(String oname);
    String updateOrg(String uname, String oname,Integer type,String url);
    String updateOrgLogo(String logo,String uname);

}
