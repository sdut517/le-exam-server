package com.leexam.mapper;

import com.leexam.entity.QuesBank;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface QuesBankMapper {
    int deleteByPrimaryKey(Integer qbid);

    int insert(QuesBank record);

    int insertSelective(QuesBank record);

    QuesBank selectByPrimaryKey(Integer qbid);

    int updateByPrimaryKeySelective(QuesBank record);

    int updateByPrimaryKey(QuesBank record);
}