package com.leexam.service.impl;

import com.leexam.entity.TestPaper;
import com.leexam.mapper.TestPaperMapper;
import com.leexam.service.TestPaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 窦康泰
 * @date 2021/01/06
 */
@Service
public class TestPaperServiceImpl implements TestPaperService {

    @Autowired
    TestPaperMapper testPaperMapper;

    @Override
    public List<TestPaper> selectAll() {
        return testPaperMapper.selectAll();
    }
}
