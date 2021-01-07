package com.leexam.service.impl;

import com.leexam.entity.Unit;
import com.leexam.mapper.UnitMapper;
import com.leexam.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 窦康泰
 * @date 2021/01/06
 */
@Service
public class UnitServiceImpl implements UnitService {

    @Autowired
    UnitMapper unitMapper;

    @Override
    public List<Unit> selectByUidArr(int[] uids) {
        return unitMapper.selectByUidArr(uids);
    }

    @Override
    public String insertSelective(Unit unit) {
        int i = unitMapper.insertSelective(unit);
        return i > 0 ? "success" : "error";
    }

    @Override
    public String updateByPrimaryKeySelective(Unit unit) {
        return unitMapper.updateByPrimaryKeySelective(unit) > 0 ? "success" : "error";
    }

    @Override
    public String deleteByPrimaryKey(Integer uid) {
        return unitMapper.deleteByPrimaryKey(uid) > 0 ? "success" : "error";
    }
}
