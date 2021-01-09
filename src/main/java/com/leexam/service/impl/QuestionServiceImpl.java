package com.leexam.service.impl;

import com.leexam.entity.Question;
import com.leexam.mapper.QuesBankMapper;
import com.leexam.mapper.QuestionMapper;
import com.leexam.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    QuestionMapper questionMapper;
    @Override
    public List<Question> findAll(String qtype, String tag, Integer difficult) {
        System.out.println(questionMapper.findAll(qtype,tag,difficult));
        return questionMapper.findAll(qtype,tag,difficult);
    }


}
