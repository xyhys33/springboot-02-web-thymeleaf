package com.example.springboot02webthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class IndexController {
    @RequestMapping("/")
    public String showIndex(Model model, HttpSession session) {
        model.addAttribute("name", "无情帅宇");
        session.setAttribute("gender","female");
        return "index";
    }
}
