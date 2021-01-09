package com.leexam.service;

import com.leexam.entity.QuesBank;

import java.util.List;
import java.util.Map;

public interface QuesBankService {
    List<QuesBank> findByOid(int oid);
    int insertBank(QuesBank quesBank);

//    按题库名词进行模糊查询
    List<QuesBank> findByQbname(String qbname,int oid);

    int findBydiff(int difficult);

    String findAlltype(int qbid);

    List<Map<String,Object>> findBytype(Integer[] q);

    int deleteByPrimaryKey(Integer qbid);

    int updateByPrimaryKeySelective(QuesBank record);

    int intoBank(String question,int qbid);
}
