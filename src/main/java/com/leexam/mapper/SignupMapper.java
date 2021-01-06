package com.leexam.mapper;

import com.leexam.entity.Signup;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;

/**
*@author 窦康泰
*@date 2021/01/05
*/
@Mapper
public interface SignupMapper {
    int deleteByPrimaryKey(Integer sid);

    @Insert("insert into signup (sanme,banner,sdesc,is_verify,collect_info,start_time,end_time,oid,url,status) VALUES(#{sname},#{banner},#{sdesc},#{is_verify},#{collect_info},#{start_time},#{end_time},#{oid},#{url},0)")
    int insert(String sname, Date start_time,Date end_time,String banner,String sdesc,Integer is_verify,Integer oid,String url,String collect_info);

    int insertSelective(Signup record);

    Signup selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Signup record);

    int updateByPrimaryKey(Signup record);
}