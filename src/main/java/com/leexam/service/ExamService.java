package com.leexam.service;

import com.leexam.entity.Exam;

import java.util.List;

/**
 * @author 窦康泰
 * @date 2021/01/07
 */
public interface ExamService {

    List<Exam> selectAll();

    String deleteByPrimaryKey(Integer eid);

    String insertSelective(Exam record);

    Exam selectByPrimaryKey(Integer eid);

    String updateByPrimaryKeySelective(Exam record);

    List<Exam> selectByOid(Integer oid);

}
