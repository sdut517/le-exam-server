package com.leexam.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.leexam.entity.Question;
import com.leexam.entity.TestPaper;
import com.leexam.entity.Unit;
import com.leexam.mapper.QuestionMapper;
import com.leexam.mapper.TestPaperMapper;
import com.leexam.mapper.UnitMapper;
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
    @Autowired
    UnitMapper unitMapper;
    @Autowired
    QuestionMapper questionMapper;

    @Override
    public List<TestPaper> selectAll() {
        List<TestPaper> testPapers = testPaperMapper.selectAll();
        for (TestPaper testPaper : testPapers) {
            String uidsJsonStr = testPaper.getUnit();
            ObjectMapper objectMapper = new ObjectMapper();
            Integer[] uids = new Integer[0];
            try {
                uids = objectMapper.readValue(uidsJsonStr, Integer[].class);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
            List<Unit> unitList = getUnitListForTestPaper(objectMapper, uids);
            testPaper.setUnitList(unitList);
        }
        return testPapers;
    }

    private List<Unit> getUnitListForTestPaper(ObjectMapper objectMapper, Integer[] uids) {
        List<Unit> unitList = unitMapper.selectByUidArr(uids);
        for (Unit unit : unitList) {
            String qidsJsonStr = unit.getQuestions();
            Integer[] qids = new Integer[0];
            try {
                qids = objectMapper.readValue(qidsJsonStr, Integer[].class);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
            List<Question> questionList = questionMapper.selectByQids(qids);
            unit.setQuestionList(questionList);
        }
        return unitList;
    }

    @Override
    public String deleteByPrimaryKey(Integer tpid) {
        return testPaperMapper.deleteByPrimaryKey(tpid) > 0 ? "success" : "error";
    }

    @Override
    public String insertSelective(TestPaper testPaper) {
        return testPaperMapper.insertSelective(testPaper) > 0 ? "success" : "error";
    }

    @Override
    public String updateByPrimaryKeySelective(TestPaper testPaper) {
        return testPaperMapper.updateByPrimaryKeySelective(testPaper) > 0 ? "success" : "error";
    }

    @Override
    public List<TestPaper> selectByTpids(Integer[] tpids) {
        return testPaperMapper.selectByTpids(tpids);
    }
}
