package com.leexam.mapper;

import com.leexam.entity.Question;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface QuestionMapper {
    int deleteByPrimaryKey(Integer qid);

    int insert(Question record);

    int insertSelective(Question record);

    Question selectByPrimaryKey(Integer qid);

    int updateByPrimaryKeySelective(Question record);

    int updateByPrimaryKey(Question record);
}