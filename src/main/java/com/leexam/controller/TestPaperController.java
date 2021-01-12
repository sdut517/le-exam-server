package com.leexam.controller;

import com.leexam.entity.TestPaper;
import com.leexam.service.TestPaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/delete")
    public String deleteByPrimaryKey(Integer tpid) {
        return testPaperService.deleteByPrimaryKey(tpid);
    }

    @PostMapping("/insert")
    public String insertSelective(TestPaper testPaper) {
        return testPaperService.insertSelective(testPaper);
    }

    @PostMapping("/update")
    public String updateByPrimaryKeySelective(TestPaper testPaper) {
        return testPaperService.updateByPrimaryKeySelective(testPaper);
    }

    @PostMapping("/bytpids")
    public List<TestPaper> selectByTpids(@RequestBody Integer[] tpids) {
        return testPaperService.selectByTpids(tpids);
    }

    @GetMapping("/bytpname")
    public List<TestPaper> selectByTpname(String tpname) {
        return testPaperService.selectByTpname(tpname);
    }

    @GetMapping("/byoid")
    public List<TestPaper> selectByOid(Integer oid) {
        return testPaperService.selectByOid(oid);
    }
}
