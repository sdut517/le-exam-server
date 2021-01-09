package com.leexam.controller;

import com.leexam.entity.Exam;
import com.leexam.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 窦康泰
 * @date 2021/01/07
 */
@RestController
@RequestMapping("exam")
public class ExamController {

    @Autowired
    ExamService examService;

    @GetMapping("/all")
    public List<Exam> selectAll() {
        return examService.selectAll();
    }

    @GetMapping("/delete")
    public String deleteByPrimaryKey(Integer eid) {
        return examService.deleteByPrimaryKey(eid);
    }

    @PostMapping("/insert")
    public String insertSelective(@RequestBody Exam record) {
        return examService.insertSelective(record);
    }

    @GetMapping("/selectbyeid")
    public Exam selectByPrimaryKey(Integer eid) {
        return examService.selectByPrimaryKey(eid);
    }

    @PostMapping("/update")
    public String updateByPrimaryKeySelective(@RequestBody Exam record) {
        return examService.updateByPrimaryKeySelective(record);
    }

}
