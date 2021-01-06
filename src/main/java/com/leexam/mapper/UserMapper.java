package com.leexam.mapper;
import com.leexam.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

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

    int deleteByPrimaryKey(Integer uid);

    @Insert("INSERT INTO user (uname,oid,email,phone,name,pid,pwd,status) VALUES(#{uname},#{oid},#{email},{phone},#{name},0,#{pwd},0)")
    int insert(String uname, int oid, String email, String phone, String name, String pwd);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

}
