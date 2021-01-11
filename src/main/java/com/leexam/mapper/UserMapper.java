package com.leexam.mapper;
import com.leexam.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from user")
    User selectAll();

    @Select("select * from user WHERE uname=#{uname} AND pwd=#{pwd}")
    User loginByUname(String uname, String pwd);

    @Select("select * from user WHERE email=#{email} AND pwd=#{pwd}")
    User loginByEmail(String email, String pwd);

    @Select("select uname from user WHERE email=#{email}")
    String selectUnameByEmail(String email);

    @Select("select * from user WHERE uname=#{uname}")
    List<User> selectAllByUname(String uname);

    @Select("select * from user WHERE uname=#{uname}")
    User selectByUname(String uname);

    @Select("select * from user WHERE email=#{email}")
    User selectByEmail(String email);

    @Select("select uid from user WHERE email=#{email}")
    int selectUidByEmail(String email);


    @Select("select oid from user where uname=#{uname}")
    int selectOidByUname(String uname);

    int deleteByPrimaryKey(Integer uid);

    @Insert("INSERT INTO user (uname,oid,email,phone,name,pid,pwd,status) VALUES(#{uname},#{oid},#{email},#{phone},#{name},0,#{pwd},0)")
    int insert(String uname, int oid, String email, String phone, String name, String pwd);

    @Insert("INSERT INTO user (uname,oid,email,name,pid,pwd,status) VALUES(#{email},#{oid},#{email},#{name},#{pid},#{pwd},0)")
    int insertMore( int oid, String email, String name,int pid, String pwd);

    User selectByPrimaryKey(Integer uid);

    @Update("update user set name=#{new_name},phone=#{phone} WHERE uid=#{uid}")
    int updateByname(int uid,String phone,String new_name);

    @Update("update user set pwd=#{pwd} WHERE uid=#{uid}")
    int updatePwd(int uid,String pwd);

    @Select("select pwd from user WHERE uid=#{uid}")
    String selectPwdById(int uid);

}
