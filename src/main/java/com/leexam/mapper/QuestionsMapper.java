package com.leexam.mapper;

import com.leexam.entity.Questions;
import org.apache.ibatis.annotations.Mapper;

/**
*@author 窦康泰
*@date 2021/01/05
*/
@Mapper
public interface QuestionsMapper {
    int deleteByPrimaryKey(Integer qsid);

    int insert(Questions record);

    int insertSelective(Questions record);

    Questions selectByPrimaryKey(Integer qsid);

    int updateByPrimaryKeySelective(Questions record);

    int updateByPrimaryKey(Questions record);
}