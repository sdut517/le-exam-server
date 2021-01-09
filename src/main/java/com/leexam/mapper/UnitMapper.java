package com.leexam.mapper;

import com.leexam.entity.Unit;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
*@author 窦康泰
*@date 2021/01/05
*/
@Mapper
public interface UnitMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(Unit record);

    int insertSelective(Unit record);

    Unit selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(Unit record);

    int updateByPrimaryKey(Unit record);

    List<Unit> selectByUidArr(Integer[] uids);
}