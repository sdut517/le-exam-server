package com.leexam.service.impl;

import com.leexam.entity.Examinee;
import com.leexam.mapper.ExamineeMapper;
import com.leexam.service.ExamineeService;
import com.leexam.vo.ExamineeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 窦康泰
 * @date 2021/01/06
 */
@Service
public class ExamineeServiceImpl implements ExamineeService {

    @Autowired
    ExamineeMapper examineeMapper;

    @Override
    public List<Examinee> selectPage(Integer start, Integer limit) {
        return examineeMapper.selectPage(start, limit);
    }

    @Override
    public List<Examinee> selectPageTimeLimit(ExamineeVO examineeVO) {
        return examineeMapper.selectPageTimeLimit(examineeVO);
    }

    @Override
    public List<Examinee> selectByEid(Integer eid) {
        return examineeMapper.selectByEid(eid);
    }


}
