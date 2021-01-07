package com.leexam.mapper;

import com.leexam.entity.Log;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LogMapper {
    int deleteByPrimaryKey(Integer lid);

    int insert(Log record);

    int insertSelective(Log record);

    Log selectByPrimaryKey(Integer lid);

    int updateByPrimaryKeySelective(Log record);

    int updateByPrimaryKey(Log record);
}