package com.leexam.service.impl;

import com.google.gson.Gson;
import com.leexam.entity.Response;
import com.leexam.service.RobotService;
import com.leexam.utils.HttpUtils;
import org.springframework.stereotype.Service;

import java.net.URLEncoder;
@Service
public class RobotServiceImpl implements RobotService {

    private String url="https://api.qingyunke.com/api.php?key=free&appid=0&msg=%s";
    private String api;
    Gson gson = new Gson();

    @Override
    public Response answer(String asks) {
        try {
            api = String.format(url, URLEncoder.encode(asks,"UTF-8"));
        }catch (Exception e){
            e.printStackTrace();
        }
        String words = HttpUtils.request(api);
        if(!words.contains("##出现错误")){
            return gson.fromJson(words,Response.class);//使用Gson对json串解析
        }
        else {
            Response response = new Response();
            response.setContent(words);
            return response;
        }

    }
}
