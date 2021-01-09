package com.leexam.service;

import com.leexam.entity.Unit;

import java.util.List;

/**
 * @author 窦康泰
 * @date 2021/01/06
 */
public interface UnitService {

    List<Unit> selectByUidArr(Integer[] uids);

    String insertSelective(Unit unit);

    String updateByPrimaryKeySelective(Unit unit);

    String deleteByPrimaryKey(Integer uid);
}
