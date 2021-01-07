package com.leexam.mapper;

import com.leexam.entity.Power;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface PowerMapper {
    int deleteByPrimaryKey(Integer pid);

    int insert(Power record);

    int insertSelective(Power record);

    Power selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(Power record);

    int updateByPrimaryKey(Power record);
}