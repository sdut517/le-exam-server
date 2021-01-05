package com.leexam.mapper;

import com.leexam.entity.QuesBank;
import org.apache.ibatis.annotations.Mapper;

/**
*@author 窦康泰
*@date 2021/01/05
*/
@Mapper
public interface QuesBankMapper {
    int deleteByPrimaryKey(Integer qbid);

    int insert(QuesBank record);

    int insertSelective(QuesBank record);

    QuesBank selectByPrimaryKey(Integer qbid);

    int updateByPrimaryKeySelective(QuesBank record);

    int updateByPrimaryKey(QuesBank record);
}