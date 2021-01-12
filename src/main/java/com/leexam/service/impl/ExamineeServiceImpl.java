package com.leexam.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.leexam.entity.Exam;
import com.leexam.entity.Examinee;
import com.leexam.entity.TestPaper;
import com.leexam.mapper.ExamMapper;
import com.leexam.mapper.ExamineeMapper;
import com.leexam.mapper.TestPaperMapper;
import com.leexam.service.ExamineeService;
import com.leexam.vo.ExamineeVO;
import com.leexam.vo.ExamineeVO2;
import org.ietf.jgss.Oid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 窦康泰
 * @date 2021/01/06
 */
@Service
public class ExamineeServiceImpl implements ExamineeService {

    @Autowired
    ExamineeMapper examineeMapper;
    @Autowired
    ExamMapper examMapper;
    @Autowired
    TestPaperMapper testPaperMapper;

    @Override
    public List<Examinee> selectPage(Integer start, Integer limit) {
        List<Examinee> examineeList = examineeMapper.selectPage(start, limit);
        for (Examinee examinee : examineeList) {
            Integer eid = examinee.getEid();
            Exam exam = examMapper.selectByPrimaryKey(eid);
            getTestPaperListForExam(exam);
            examinee.setExam(exam);
        }
        return examineeList;
    }

    public void getTestPaperListForExam(Exam exam) {
        String tpidsJsonStr = exam.getTestPaper();
        ObjectMapper objectMapper = new ObjectMapper();
        Integer[] tpids = new Integer[0];
        try {
            tpids = objectMapper.readValue(tpidsJsonStr, Integer[].class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        List<TestPaper> testPaperList = testPaperMapper.selectByTpids(tpids);
        exam.setTestPaperList(testPaperList);
    }

    @Override
    public List<Examinee> selectPageTimeLimit(ExamineeVO examineeVO) {
        return examineeMapper.selectPageTimeLimit(examineeVO);
    }

    @Override
    public List<Examinee> selectByEid(Integer eid) {
        return examineeMapper.selectByEid(eid);
    }


    @Override
    public List<Examinee> selectByEeidAndEid(Integer eeid, Integer eid) {
        return examineeMapper.selectByEeidAndEid(eeid, eid);
    }

    @Override
    public List<Examinee> selectExamineeSignupDoSignupByOid(Integer oid) {
        List<Examinee> examineeList = examineeMapper.selectExamineeSignupDoSignupByOid(oid);
        for (Examinee examinee : examineeList) {
            getTestPaperListForExam(examinee.getExam());
        }
        return examineeList;
    }

    @Override
    public int selectCountByOidAndStatus(Integer oid, Integer status) {
        return examineeMapper.selectCountByOidAndStatus(oid, status);
    }

    @Override
    public int selectCountToday(Integer oid) {
        return examineeMapper.selectCountToday(oid);
    }

    @Override
    public int selectCountSum(Integer oid) {
        return examineeMapper.selectCountSum(oid);
    }

    @Override
    public int selectCountTodayByOidAndStatus(Integer oid, Integer status) {
        return examineeMapper.selectCountTodayByOidAndStatus(oid, status);
    }

    @Override
    public int deleteByEeids(Integer[] eeids) {
        return examineeMapper.deleteByEeids(eeids);
    }

    @Override
    public List<Examinee> selectByEidAndNameOrNumber(Integer eid, String nameOrNumber) {
        return examineeMapper.selectByEidAndNameOrNumber(eid, "%" + nameOrNumber + "%");
    }

    @Override
    public String updateStatusByEeids(ExamineeVO2 examineeVO2) {
        return examineeMapper.updateStatusByEeids(examineeVO2) > 0 ? "success" : "error";
    }

    @Override
    public List<Examinee> selectByEeids(Integer[] eeids) {
        return examineeMapper.selectByEeids(eeids);
    }

}
