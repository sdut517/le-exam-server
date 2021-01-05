package com.leexam.mapper;

import com.leexam.entity.Answer;
import org.apache.ibatis.annotations.Mapper;

/**
*@author 窦康泰
*@date 2021/01/05
*/
@Mapper
public interface AnswerMapper {
    int deleteByPrimaryKey(Integer aid);

    int insert(Answer record);

    int insertSelective(Answer record);

    Answer selectByPrimaryKey(Integer aid);

    int updateByPrimaryKeySelective(Answer record);

    int updateByPrimaryKey(Answer record);
}