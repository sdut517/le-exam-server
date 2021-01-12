package com.leexam.mapper;

import com.leexam.entity.TestPaper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
*@author 窦康泰
*@date 2021/01/05
*/
@Mapper
public interface TestPaperMapper {
    int deleteByPrimaryKey(Integer tpid);

    int insert(TestPaper record);

    int insertSelective(TestPaper record);

    TestPaper selectByPrimaryKey(Integer tpid);

    int updateByPrimaryKeySelective(TestPaper record);

    int updateByPrimaryKey(TestPaper record);

    List<TestPaper> selectAll();

    List<TestPaper> selectByTpids(Integer[] tpids);

    List<TestPaper> selectByTpname(String tpname);

    List<TestPaper> selectByOid(Integer oid);
}