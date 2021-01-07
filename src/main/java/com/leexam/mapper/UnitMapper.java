package com.leexam.mapper;

import com.leexam.entity.Unit;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UnitMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(Unit record);

    int insertSelective(Unit record);

    Unit selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(Unit record);

    int updateByPrimaryKey(Unit record);
}