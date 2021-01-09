package com.leexam.controller;

import com.leexam.entity.Unit;
import com.leexam.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 窦康泰
 * @date 2021/01/06
 */
@RestController
@RequestMapping("unit")
public class UnitController {

    @Autowired
    UnitService unitService;

    @PostMapping("/uids")
    public List<Unit> selectAll(@RequestBody Integer[] uids) {
        return unitService.selectByUidArr(uids);
    }


    @PostMapping("/insert")
    public String insertSelective(@RequestBody Unit unit) {
        return unitService.insertSelective(unit);
    }

    @PostMapping("/update")
    public String updateByPrimaryKeySelective(@RequestBody Unit unit) {
        return unitService.updateByPrimaryKeySelective(unit);
    }

    @GetMapping("/delete")
    public String deleteByPrimaryKey(Integer uid) {
        return unitService.deleteByPrimaryKey(uid);
    }
}
