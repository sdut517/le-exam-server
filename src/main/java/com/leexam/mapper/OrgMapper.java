package com.leexam.mapper;

import com.leexam.entity.Org;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.aspectj.weaver.ast.Or;

import java.util.List;

@Mapper
public interface OrgMapper {
    @Insert("INSERT INTO org (oname, type) VALUES (#{oname}, 0)")
    int addOrg(String oname);

    @Select("SELECT * FROM org WHERE oname = #{oname}")
    Org selectAllByOname(String oname);

    @Select("select oid from org WHERE oname=#{oname}")
    int selectOidByOname(String oname);

    @Select("select * from org WHERE oid=#{oid}")
    List<Org> selectAllByOid(Integer Oid);

    int deleteByPrimaryKey(Integer oid);

    int insert(Org record);

    int insertSelective(Org record);

    Org selectByPrimaryKey(Integer oid);

    @Update("update org set oname=#{oname},type=#{type},url=#{url} WHERE oid=#{oid}")
    int updateByOid(Integer oid, String oname,Integer type,String url);

    @Update("update org set logo=#{logo} WHERE oid=#{oid}")
    int updateOrgLogo(String logo,Integer oid);

    @Update("update org set eids=#{eids} where oid=#{oid}")
    int updateEidsByOid(Org org);
}