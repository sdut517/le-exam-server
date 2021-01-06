package com.leexam.service.impl;

import com.leexam.mapper.OrgMapper;
import com.leexam.mapper.UserMapper;
import com.leexam.service.OrgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrgServiceImpl implements OrgService {
    @Autowired
    OrgMapper orgMapper;
    @Autowired
    UserMapper userMapper;

    @Override
    public String addOrg(String oname) {
        if(orgMapper.selectAllByOname(oname)==null){
            orgMapper.addOrg(oname);
        }
        return "";
    }
    @Override
    public String updateOrg(String uname, String oname, Integer typs, String url, String logo) {
        Integer oid=userMapper.selectOidByUname(uname);
        orgMapper.updateByOid(oid, oname, typs, url, logo);
        return "success";
    }


}
