package com.leexam.mapper;
import com.leexam.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UserMapper {
    @Select("select * from user")
    User selectAll();

    @Select("select * from user WHERE uname=#{uname} AND pwd=#{pwd}")
    User loginByUname(String uname, String pwd);

    @Select("select * from user WHERE email=#{email} AND pwd=#{pwd}")
    User loginByEmail(String email, String pwd);

    @Select("select * from user WHERE uname=#{uname}")
    User selectByUname(String uname);

    @Select("select * from user WHERE email=#{email}")
    User selectByEmail(String email);

    @Select("select oid from user where uname=#{uname}")
    Integer selectOidByUname(String uname);

    int deleteByPrimaryKey(Integer uid);

    @Insert("INSERT INTO user (uname,oid,email,phone,name,pid,pwd,status) VALUES(#{uname},#{oid},#{email},{phone},#{name},0,#{pwd},0)")
    int insert(String uname, int oid, String email, String phone, String name, String pwd);

    @Insert("INSERT INTO user (uname,oid,email,name,pid,pwd,status) VALUES(#{email},#{oid},#{email},#{name},#{pid},#{pwd},0)")
    int insertMore( int oid, String email, String name,int pid, String pwd);

    User selectByPrimaryKey(Integer uid);

    @Update("update user set name=#{name},phone=#{phone} WHERE name=#{name}")
    int updateByname(String name,String phone);

    @Update("update user set pwd=#{pwd} WHERE name=#{name}")
    int updatePwd(String name,String pwd);

    @Select("select pwd from user WHERE name=#{name}")
    String selectPwdByName(String name);

}
