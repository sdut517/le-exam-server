package com.leexam.mapper;

import com.leexam.entity.Exam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
*@author 窦康泰
*@date 2021/01/05
*/
@Mapper
public interface ExamMapper {
    int deleteByPrimaryKey(Integer eid);

    int insert(Exam record);

    int insertSelective(Exam record);

    Exam selectByPrimaryKey(Integer eid);

    int updateByPrimaryKeySelective(Exam record);

    int updateByPrimaryKey(Exam record);

    List<Exam> selectAll();
}