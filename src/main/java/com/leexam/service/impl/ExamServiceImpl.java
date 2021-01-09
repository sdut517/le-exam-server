package com.leexam.service.impl;

import com.leexam.entity.Exam;
import com.leexam.mapper.ExamMapper;
import com.leexam.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 窦康泰
 * @date 2021/01/07
 */
@Service
public class ExamServiceImpl implements ExamService {

    @Autowired
    ExamMapper examMapper;

    @Override
    public List<Exam> selectAll() {
        return examMapper.selectAll();
    }

    @Override
    public String deleteByPrimaryKey(Integer eid) {
        return examMapper.deleteByPrimaryKey(eid) > 0 ? "success" : "error";
    }

    @Override
    public String insertSelective(Exam record) {
        return examMapper.insertSelective(record) > 0 ? "success" : "error";
    }

    @Override
    public Exam selectByPrimaryKey(Integer eid) {
        return examMapper.selectByPrimaryKey(eid);
    }

    @Override
    public String updateByPrimaryKeySelective(Exam record) {
        return examMapper.updateByPrimaryKeySelective(record) > 0 ? "success" : "error";
    }
}
