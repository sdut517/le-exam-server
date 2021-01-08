package com.leexam.controller;

import com.leexam.entity.Question;
import com.leexam.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/insert")
    public String insertSelective(@RequestBody Question question) {
        return questionService.insertSelective(question);
    }

    @PostMapping("/update")
    public String updateByPrimaryKeySelective(@RequestBody Question question) {
        return questionService.updateByPrimaryKeySelective(question);
    }

    @GetMapping("/delete")
    public String deleteByPrimaryKey(Integer qid) {
        return questionService.deleteByPrimaryKey(qid);
    }
}
