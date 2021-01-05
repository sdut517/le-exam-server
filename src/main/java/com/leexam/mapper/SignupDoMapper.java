package com.leexam.mapper;

import com.leexam.entity.SignupDo;
import org.apache.ibatis.annotations.Mapper;

/**
*@author 窦康泰
*@date 2021/01/05
*/
@Mapper
public interface SignupDoMapper {
    int deleteByPrimaryKey(Integer sdid);

    int insert(SignupDo record);

    int insertSelective(SignupDo record);

    SignupDo selectByPrimaryKey(Integer sdid);

    int updateByPrimaryKeySelective(SignupDo record);

    int updateByPrimaryKey(SignupDo record);
}