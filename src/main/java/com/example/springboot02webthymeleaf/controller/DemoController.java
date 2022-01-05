package com.example.springboot02webthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class DemoController {
    @RequestMapping("/demo1")
    @ResponseBody
    public String demo1(){
        int i =5/0;
        return "demo1";

    }

    @RequestMapping("/demo2")
    @ResponseBody
    public String demo2(){
        String str ="hello";
        int a=Integer.parseInt(str);
        return "demo2";

    }
}
