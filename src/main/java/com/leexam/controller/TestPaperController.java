package com.leexam.controller;

import com.leexam.entity.TestPaper;
import com.leexam.service.TestPaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 窦康泰
 * @date 2021/01/06
 */
@RestController
@RequestMapping("testpaper")
public class TestPaperController {

    @Autowired
    TestPaperService testPaperService;

    @GetMapping("/all")
    public List<TestPaper> selectAll() {
        return testPaperService.selectAll();
    }

}
