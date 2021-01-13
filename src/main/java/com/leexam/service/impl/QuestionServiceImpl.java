package com.leexam.service.impl;

import com.leexam.entity.Question;
import com.leexam.mapper.QuesBankMapper;
import com.leexam.mapper.QuestionMapper;
import com.leexam.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 窦康泰
 * @date 2021/01/06
 */
@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    QuestionMapper questionMapper;

    @Override
    public List<Question> selectByQids(Integer[] qids) {
        return questionMapper.selectByQids(qids);
    }

    @Override
    public String insertSelective(Question question) {
        return questionMapper.insertSelective(question) > 0 ? "success" : "error";
    }

    @Override
    public String updateByPrimaryKeySelective(Question question) {
        return questionMapper.updateByPrimaryKeySelective(question) > 0 ? "success" : "error";
    }

    @Override
    public String deleteByPrimaryKey(Integer qid) {
        return questionMapper.deleteByPrimaryKey(qid) > 0 ? "success" : "error";
    }

    @Override
    public List<Question> findAll(String qtype, String tag, Integer difficult) {
        System.out.println(questionMapper.findAll(qtype,tag,difficult));
        return questionMapper.findAll(qtype,tag,difficult);
    }

    @Override
    public int findqid(){
        return questionMapper.findqid();
    }


}
