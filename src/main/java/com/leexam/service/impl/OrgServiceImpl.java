package com.leexam.service.impl;

import com.leexam.mapper.OrgMapper;
import com.leexam.service.OrgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrgServiceImpl implements OrgService {
    @Autowired
    OrgMapper orgMapper;

    @Override
    public String addOrg(String oname) {
        if(orgMapper.selectOname(oname)==null){
            orgMapper.addOrg(oname);
        }
        return "";
    }


}
