package com.leexam.mapper;

import com.leexam.entity.Signup;
import org.apache.ibatis.annotations.Mapper;

/**
*@author 窦康泰
*@date 2021/01/05
*/
@Mapper
public interface SignupMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(Signup record);

    int insertSelective(Signup record);

    Signup selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Signup record);

    int updateByPrimaryKey(Signup record);
}