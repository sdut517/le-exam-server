package com.leexam.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.leexam.entity.QuesBank;
import com.leexam.service.QuesBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class QuesBankController {
    @Autowired
    QuesBankService quesBankService;
    @PostMapping("/quesbank")
    public List<QuesBank> findByOid(@RequestParam("oid")int oid){
        return quesBankService.findByOid(oid);

    }

    @PostMapping("/quesinsert")
    public int insertBank(@RequestParam("qbname")String qbname,@RequestParam("oid")int oid){
        QuesBank quesBank = new QuesBank();
        quesBank.setQbname(qbname);
        quesBank.setCreateTime(new Date());
        quesBank.setUpdateTime(new Date());
        quesBank.setOid(oid);
        int i=quesBankService.insertBank(quesBank);
        return i;
    }

    @PostMapping("/quesfind")
    public List<QuesBank> findByQbname(@RequestParam("qbname")String qbname,@RequestParam("oid") int oid){
        return quesBankService.findByQbname(qbname,oid);
    }

    @PostMapping("/quesdiff")
    public List<Integer> findBydiff(){
        List<Integer>  m = new ArrayList<Integer>();
        int x=quesBankService.findBydiff(1);
        int y=quesBankService.findBydiff(2);
        int z=quesBankService.findBydiff(3);
        m.add(x);
        m.add(y);
        m.add(z);
        m.add(x+y+z);
        return m;
    }

    @PostMapping("/typeround")
    public List<Map<String,Object>> quesList(@RequestParam("qbid")int qbid) throws JsonProcessingException {
        String s = quesBankService.findAlltype(qbid);

        ObjectMapper objectMapper = new ObjectMapper();
        Integer[] integers = objectMapper.readValue(s, Integer[].class);
        Integer[] integers1 = Arrays.copyOf(integers, integers.length + 1);
        integers1[integers1.length - 1] = 3;
        String s1 = objectMapper.writeValueAsString(integers1);

        return quesBankService.findBytype(integers);

    }
    @PostMapping("/deletebank")
    public int deleteByPrimaryKey(@RequestParam("qbid")int qbid){
        int i = quesBankService.deleteByPrimaryKey(qbid);
        return i;
    }

    @PostMapping("/updatebank")
    public int updateByPrimaryKeySelective(@RequestParam("qbid")int qbid,
                                  @RequestParam("qbname")String qbname
                                  ){
        QuesBank quesBank = new QuesBank();
        quesBank.setQbid(qbid);
        quesBank.setQbname(qbname);
        quesBank.setUpdateTime(new Date());
        int i = quesBankService.updateByPrimaryKeySelective(quesBank);
        return i;
    }

    @PostMapping("intobank")
    public int intoBank(@RequestParam("qbid")int qbid,@RequestParam("qid")int qid) throws JsonProcessingException {
        String s = quesBankService.findAlltype(qbid);
        ObjectMapper objectMapper = new ObjectMapper();
        Integer[] integers = objectMapper.readValue(s, Integer[].class);
        Integer[] integers1 = Arrays.copyOf(integers, integers.length + 1);
        integers1[integers1.length - 1] = qid;
        String s1 = objectMapper.writeValueAsString(integers1);
        int i = quesBankService.intoBank(s1,qbid);

        return i;

    }


}
