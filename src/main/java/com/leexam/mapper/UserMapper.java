package com.leexam.mapper;
import com.leexam.entity.User;
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

    int deleteByPrimaryKey(Integer uid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

}
