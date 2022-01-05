package com.example.springboot02webthymeleaf.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public String AroException(){
        return "全局错误";
    }
}
