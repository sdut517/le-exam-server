package com.leexam.service.impl;

import com.leexam.entity.QuesBank;
import com.leexam.mapper.QuesBankMapper;
import com.leexam.service.QuesBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class QuesBankServiceImpl implements QuesBankService {
    @Autowired
    QuesBankMapper quesBankMapper;
    @Override
    public List<QuesBank> findByOid(int oid) {
        return quesBankMapper.findByOid(oid);
    }

    @Override
    public int insertBank(QuesBank quesBank) {
        int i=quesBankMapper.insertBank(quesBank);
        if(i!=0){
            return 1;
        }
        else {
            return 0;
        }
    }

    @Override
    public List<QuesBank> findByQbname(String qbname, int oid) {
        return quesBankMapper.findByQbname(qbname,oid);
    }

    @Override
    public int findBydiff(int difficult,Integer[] q) {
        return quesBankMapper.findBydiff(difficult,q);
    }

    @Override
    public String findAlltype(int qbid) {
        return quesBankMapper.findAlltype(qbid);
    }

    @Override
    public List<Map<String,Object>> findBytype(Integer[] q) {
        return quesBankMapper.findBytype(q);
    }

    @Override
    public int deleteByPrimaryKey(Integer qbid) {
        return quesBankMapper.deleteByPrimaryKey(qbid);
    }

    @Override
    public int updateByPrimaryKeySelective(QuesBank record) {
        return quesBankMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int intoBank(String question, int qbid) {
        return quesBankMapper.intoBank(question,qbid);
    }
}
