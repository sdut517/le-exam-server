package com.leexam.controller;

import com.leexam.entity.Unit;
import com.leexam.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public List<Unit> selectAll(@RequestBody int[] uids) {
        return unitService.selectByUidArr(uids);
    }

}
