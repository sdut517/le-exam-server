package com.leexam.service;

import com.leexam.entity.Unit;

import java.util.List;

/**
 * @author 窦康泰
 * @date 2021/01/06
 */
public interface UnitService {

    List<Unit> selectByUidArr(int[] uids);

}
