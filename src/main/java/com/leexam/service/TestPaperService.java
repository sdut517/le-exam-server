package com.leexam.service;

import com.leexam.entity.TestPaper;

import java.util.List;

/**
 * @author 窦康泰
 * @date 2021/01/06
 */
public interface TestPaperService {

    List<TestPaper> selectAll();

    String deleteByPrimaryKey(Integer tpid);

    String insertSelective(TestPaper testPaper);

    String updateByPrimaryKeySelective(TestPaper testPaper);

    List<TestPaper> selectByTpids(Integer[] tpids);
}
