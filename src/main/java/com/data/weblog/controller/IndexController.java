package com.data.weblog.controller;

import com.data.weblog.service.AvgPvService;
import com.data.weblog.service.FlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @Autowired
    private AvgPvService avgPvService;

    @Autowired
    private FlowService flowService;

    @RequestMapping("/index.action")
    public String skipToIndex(){

        return "index";
    }

    @RequestMapping("/avgPvNum.action")
    @ResponseBody
    public  String getAvgPvJson(){
        String avgJson =  avgPvService.getAvgJson();
        return avgJson;
    }

}
