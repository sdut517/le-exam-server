package com.leexam.mapper;

import com.leexam.entity.Signup;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Mapper
public interface SignupMapper {
    int deleteByPrimaryKey(Integer sid);

    @Insert("insert into signup (sname,banner,sdesc,is_verify,collect_info,start_time,end_time,oid,url,status) VALUES(#{sname},#{banner},#{sdesc},#{is_verify},#{collect_info},#{start_time},#{end_time},#{oid},#{url},0)")
    int insert(String sname,String banner, Date start_time, Date end_time, String sdesc, Integer is_verify, Integer oid, String url, String  collect_info);

    int insertSelective(Signup record);

    Signup selectByPrimaryKey(Integer sid);

    @Update("update signup set banner=#{banner} WHERE sname=#{sname}")
    int updateBanner(String sname,String banner);

    @Update("update signup set sname=#{new_sname},start_time=#{start_time},end_time=#{end_time},sdesc=#{sdesc},is_verify=#{is_verify} WHERE sname=#{sname}")
    int updateBySname(String sname,String new_sname,Date start_time,Date end_time,String sdesc,Integer is_verify);

    @Select("select sname,start_time,end_time,status from signup WHERE oid=#{oid}")
    @Results(value = {
            @Result(column = "sname", property = "sname"),
            @Result(column = "start_time", property = "startTime"),
            @Result(column = "end_time", property = "endTime"),
            @Result(column = "status", property = "status")
    })
    List<Signup> selectSignupByOid(Integer oid);

}