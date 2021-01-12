package com.leexam.service;

import com.leexam.entity.Examinee;
import com.leexam.vo.ExamineeVO;
import com.leexam.vo.ExamineeVO2;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @author 窦康泰
 * @date 2021/01/06
 */
public interface ExamineeService {

    List<Examinee> selectPage(Integer start, Integer limit);

    List<Examinee> selectPageTimeLimit(ExamineeVO examineeVO);

    List<Examinee> selectByEid(Integer eid);

    List<Examinee> selectByEeidAndEid( Integer eeid, Integer eid);

    List<Examinee> selectExamineeSignupDoSignupByOid(Integer oid);

    int selectCountByOidAndStatus(Integer oid, Integer status);

    int selectCountToday(Integer oid);

    int selectCountSum(Integer oid);

    int selectCountTodayByOidAndStatus(Integer oid, Integer status);

    int deleteByEeids(Integer[] eeids);

    List<Examinee> selectByEidAndNameOrNumber(Integer eid, String nameOrNumber);

    String updateStatusByEeids(ExamineeVO2 examineeVO2);

    List<Examinee> selectByEeids(Integer[] eeids);
}
