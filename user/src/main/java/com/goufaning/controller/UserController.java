package com.goufaning.controller;

import com.goufaning.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 *
 *
 * @author goufn
 * @version V1.0
 * @date 2020-04-01 20:30
 */
@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    public static final String URL = "http://SERVER-POWER";

    @RequestMapping("/getUser")
    public R getUser(){
        Map<String,Object> map = new HashMap<>();
        map.put("key","user");

        return R.success("返回成功",map);
    }


    @RequestMapping("/getPower")
    public R getPower(){
        return R.success("操作成功",restTemplate.getForObject(URL + "/getPower",Object.class));
    }
}
