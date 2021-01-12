package com.leexam.mapper;

import com.leexam.entity.Log;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;

@Mapper
public interface LogMapper {
    int deleteByPrimaryKey(Integer lid);

//    @Insert("insert into log (type,lname,lbody,ltime) VALUES (#{type},#{lname},#{lbody},#{ltime}")
    int insert(Integer type, String lname, String lbody, Date ltime);

    int insertSelective(Log record);

    Log selectByPrimaryKey(Integer lid);

    int updateByPrimaryKeySelective(Log record);

    int updateByPrimaryKey(Log record);
}