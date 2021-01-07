package com.leexam.mapper;

import com.leexam.entity.Examinee;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface ExamineeMapper {
    int deleteByPrimaryKey(Integer eeid);

    int insert(Examinee record);

    int insertSelective(Examinee record);

    Examinee selectByPrimaryKey(Integer eeid);

    int updateByPrimaryKeySelective(Examinee record);

    int updateByPrimaryKey(Examinee record);
}