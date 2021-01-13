package com.leexam.controller;

import com.leexam.service.OrgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 窦康泰
 * @date 2021/01/13
 */
@RestController
@RequestMapping("/org")
public class OrgController {

    @Autowired
    OrgService orgService;

    @GetMapping("/updatelogo")
    public String updateLogo(String uname, String logo) {
        return orgService.updateOrgLogo(uname, logo);
    }

}
