package com.leexam.service;

import com.leexam.entity.Examinee;
import com.leexam.vo.ExamineeVO;
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

}
