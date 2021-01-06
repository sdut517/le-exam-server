package com.leexam.mapper;

import com.leexam.entity.Examinee;
import com.leexam.vo.ExamineeVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
*@author 窦康泰
*@date 2021/01/05
*/
@Mapper
public interface ExamineeMapper {
    int deleteByPrimaryKey(Integer eeid);

    int insert(Examinee record);

    int insertSelective(Examinee record);

    Examinee selectByPrimaryKey(Integer eeid);

    int updateByPrimaryKeySelective(Examinee record);

    int updateByPrimaryKey(Examinee record);

    List<Examinee> selectPage(@Param("start") Integer start, @Param("limit") Integer limit);

    List<Examinee> selectPageTimeLimit(ExamineeVO examineeVO);

    List<Examinee> selectByEid(Integer eid);
}