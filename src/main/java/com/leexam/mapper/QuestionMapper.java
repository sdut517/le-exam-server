package com.leexam.mapper;

import com.leexam.entity.Question;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

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

    List<Question> selectByQids(Integer[] qids);

//    根据类型，难度，题型三个不同的查询条件进行检索
    List<Question> findAll(@Param("tag") String tag, @Param("qtype") String qtype, @Param("difficult") Integer difficult);

    //查询数据库内最后一条数据
    @Select("select max(qid) from question")
    int findqid();

}