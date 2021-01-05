package com.leexam.mapper;

import com.leexam.entity.Question;
import org.apache.ibatis.annotations.Mapper;

/**
*@author 窦康泰
*@date 2021/01/05
*/
@Mapper
public interface QuestionMapper {
    int deleteByPrimaryKey(Integer qid);

    int insert(Question record);

    int insertSelective(Question record);

    Question selectByPrimaryKey(Integer qid);

    int updateByPrimaryKeySelective(Question record);

    int updateByPrimaryKey(Question record);
}