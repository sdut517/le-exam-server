package com.leexam.mapper;

import com.leexam.entity.Org;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface OrgMapper {
    @Insert("INSERT INTO org (oname, type) VALUES (#{oname}, 0)")
    int addOrg(String oname);

    @Select("SELECT * FROM org WHERE oname = #{oname}")
    Org selectOne(String oname);
}
