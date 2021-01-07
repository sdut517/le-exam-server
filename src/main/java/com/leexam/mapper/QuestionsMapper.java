package com.leexam.mapper;

import com.leexam.entity.Questions;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface QuestionsMapper {
    int deleteByPrimaryKey(Integer qsid);

    int insert(Questions record);

    int insertSelective(Questions record);

    Questions selectByPrimaryKey(Integer qsid);

    int updateByPrimaryKeySelective(Questions record);

    int updateByPrimaryKey(Questions record);
}