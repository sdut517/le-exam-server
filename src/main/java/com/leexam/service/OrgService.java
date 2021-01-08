package com.leexam.service;

import com.leexam.entity.Org;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface OrgService {
    String addOrg(String oname);
    String updateOrg(String uname, String oname,Integer type,String url);
    String updateOrgLogo(String uname,String logo);
    List<Org> selectAllByUname(String uname);

}
