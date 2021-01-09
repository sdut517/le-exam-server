package com.leexam.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.leexam.entity.Question;
import com.leexam.mapper.QuesBankMapper;
import com.leexam.service.QuesBankService;
import com.leexam.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class QuestionController {
    @Autowired
    QuestionService questionService;
    @PostMapping("/allquestion")
    public List<Question> findAll(@RequestParam("tag")String tag,
                                  @RequestParam("qtype")String qtype,
                                  @RequestParam("difficult")Integer difficult){
        System.out.println(tag);
        System.out.println(qtype);
        System.out.println(difficult);
        return questionService.findAll(tag,qtype,difficult);

    }

}
