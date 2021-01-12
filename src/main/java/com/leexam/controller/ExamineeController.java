package com.leexam.controller;

import com.leexam.entity.Examinee;
import com.leexam.service.ExamineeService;
import com.leexam.service.impl.ExamineeServiceImpl;
import com.leexam.vo.ExamineeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 窦康泰
 * @date 2021/01/06
 */
@RestController
@RequestMapping("examinee")
public class ExamineeController {

    @Autowired
    ExamineeService examineeService;

    @GetMapping("/page")
    public List<Examinee> selectPage(Integer start, Integer limit) {
        return examineeService.selectPage(start, limit);
    }

    @PostMapping("/time/page")
    public List<Examinee> selectPageTimeLimit(@RequestBody ExamineeVO examineeVO) {
        return examineeService.selectPageTimeLimit(examineeVO);
    }

    @GetMapping("/eid/page")
    public List<Examinee> selectByEid(Integer eid) {
        return examineeService.selectByEid(eid);
    }

    @GetMapping("/{eeid}/{eid}")
    public List<Examinee> selectByEeidAndEid(@PathVariable("eeid") Integer eeid,@PathVariable("eid") Integer eid) {
        return examineeService.selectByEeidAndEid(eeid, eid);
    }

}
