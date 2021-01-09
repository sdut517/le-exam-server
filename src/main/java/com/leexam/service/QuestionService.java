package com.leexam.service;

import com.leexam.entity.Question;

import java.util.List;


/**
 * @author 窦康泰
 * @date 2021/01/06
 */
public interface QuestionService {

    List<Question> selectByQids(int[] qids);

    String insertSelective(Question question);

    String updateByPrimaryKeySelective(Question question);

    String deleteByPrimaryKey(Integer qid);

    List<Question> findAll(String qtype, String tag, Integer difficult);

}
