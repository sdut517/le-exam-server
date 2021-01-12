package com.leexam.mapper;

import com.leexam.entity.Examinee;
import com.leexam.vo.ExamineeVO;
import com.leexam.vo.ExamineeVO2;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestBody;

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

    List<Examinee> selectByEidAndNameOrNumber(@Param("eid") Integer eid, @Param("nameOrNumber") String nameOrNumber);

    int updateStatusByEeids(ExamineeVO2 examineeVO2);

    List<Examinee> selectByEeids(Integer[] eeids);
}