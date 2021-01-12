package com.leexam.mapper;

import com.leexam.entity.Examinee;
import com.leexam.vo.ExamineeVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface ExamineeMapper {
    int deleteByPrimaryKey(Integer eeid);

    int insert(Examinee record);

    int insertSelective(Examinee record);

    Examinee selectByPrimaryKey(Integer eeid);

    int updateByPrimaryKeySelective(Examinee record);

    int updateByPrimaryKey(Examinee record);

    List<Examinee> selectPage(@Param("start") Integer start, @Param("limit") Integer limit);

    List<Examinee> selectPageTimeLimit(ExamineeVO examineeVO);

    List<Examinee> selectByEid(Integer eid);

    List<Examinee> selectByEeidAndEid(@Param("eeid") Integer eeid, @Param("eid") Integer eid);

    List<Examinee> selectExamineeSignupDoSignupByOid(Integer oid);

    int selectCountByOidAndStatus(@Param("oid") Integer oid, @Param("status") Integer status);

    int selectCountTodayByOidAndStatus(@Param("oid") Integer oid, @Param("status") Integer status);

    int selectCountToday(Integer oid);

    int selectCountSum(Integer oid);

    int deleteByEeids(Integer[] eeids);
}