package com.goufaning.power1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author goufn
 * @version V1.0
 * @date 2020-04-01 20:47
 */
@RestController
public class PowerController {

    @RequestMapping("/getPower")
    public Object getPoser(){
        Map<String,Object> map = new HashMap<>();
        map.put("key","power1");
        return map;
    }
}
