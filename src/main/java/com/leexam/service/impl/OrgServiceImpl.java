package com.leexam.service.impl;

import com.leexam.controller.FileController;
import com.leexam.entity.Org;
import com.leexam.mapper.OrgMapper;
import com.leexam.mapper.UserMapper;
import com.leexam.service.OrgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrgServiceImpl implements OrgService {
    @Autowired
    OrgMapper orgMapper;
    @Autowired
    UserMapper userMapper;


    @Override
    public String addOrg(String oname) {
        if(orgMapper.selectAllByOname(oname)==null){
            int i =orgMapper.addOrg(oname);
            if(i!=0){
                return "success";
            }
            else {
                return "failed";
            }
        }
        return "";
    }
    @Override
    public String updateOrg(String uname, String oname, Integer typs, String url) {
        Integer oid=userMapper.selectOidByUname(uname);
        int i = orgMapper.updateByOid(oid, oname, typs, url);
        if(i!=0) {
            return "Change the success";
        }
        else {
            return "Change the failure";
        }
    }

    @Override
    public String updateOrgLogo(String uname,String logo) {
        int oid = userMapper.selectOidByUname(uname);
        System.out.println(oid);
        int i = orgMapper.updateOrgLogo(logo, oid);
        if (i != 0) {
            return "Change the success";
        } else {
            return "Change the failure";
        }
    }

    @Override
    public List<Org> selectAllByUname(String uname) {
        int oid = userMapper.selectOidByUname(uname);
        return orgMapper.selectAllByOid(oid);
    }
}
