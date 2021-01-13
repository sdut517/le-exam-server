package com.leexam.controller;

import com.leexam.entity.Response;
import com.leexam.service.RobotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServicerController {

    @Autowired
    RobotService robotService;
    @PostMapping("/servicer")
    public String servicer(@RequestParam("asks")String asks){
        Response response = robotService.answer(asks);

        String ans =new String(response.getContent().getBytes());
        System.out.println(ans);

        return ans;

    }
}
