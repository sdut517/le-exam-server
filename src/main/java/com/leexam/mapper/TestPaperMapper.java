package com.leexam.mapper;

import com.leexam.entity.TestPaper;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface TestPaperMapper {
    int deleteByPrimaryKey(Integer tpid);

    int insert(TestPaper record);

    int insertSelective(TestPaper record);

    TestPaper selectByPrimaryKey(Integer tpid);

    int updateByPrimaryKeySelective(TestPaper record);

    int updateByPrimaryKey(TestPaper record);
}