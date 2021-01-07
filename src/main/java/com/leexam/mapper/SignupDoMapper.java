package com.leexam.mapper;

import com.leexam.entity.SignupDo;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface SignupDoMapper {
    int deleteByPrimaryKey(Integer sdid);

    int insert(SignupDo record);

    int insertSelective(SignupDo record);

    SignupDo selectByPrimaryKey(Integer sdid);

    int updateByPrimaryKeySelective(SignupDo record);

    int updateByPrimaryKey(SignupDo record);
}