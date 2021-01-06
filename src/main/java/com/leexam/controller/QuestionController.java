package com.leexam.controller;

import com.leexam.entity.Question;
import com.leexam.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 窦康泰
 * @date 2021/01/06
 */
@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @PostMapping("/qids")
    public List<Question> selectByQids(@RequestBody int[] qids) {
        return questionService.selectByQids(qids);
    }

}
