package com.leexam.service;

import com.leexam.entity.Question;

import java.util.List;

public interface QuestionService {
    List<Question> findAll(String qtype, String tag, Integer difficult);


}
