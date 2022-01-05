package com.example.springboot02webthymeleaf.controller;


import com.example.springboot02webthymeleaf.pojo.Star;
import com.example.springboot02webthymeleaf.service.StarService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

@Controller
//@ResponseBody//返回json字符串
//@RestController //@controller+responsebody
@RequestMapping("/star/")
public class StarController {
    @Resource
    private StarService starService;

    @GetMapping("/insert")
    public String insert(Star star) {

        int rst = starService.insert(star);
        return rst > 0 ? "成功" : "失败";


    }

    @GetMapping("/selectAll")
    public String selectAll(@RequestParam(value = "pageNum",defaultValue = "1") int pageNum ,Model model) {
        PageHelper.startPage(pageNum,3);
        List<Star> stars = starService.selectAll();
        PageInfo<Star> pageInfo =new PageInfo<>(stars);
        model.addAttribute("pageInfo",pageInfo);

        return "listStars";


    }

    @GetMapping("/selectById")
    public Star selectAll(int id) {

        return starService.selectById(id);


    }

    //通过ID删除
    @GetMapping("/deleteById")
    public String deleteById(int id) {

        int rst = starService.deleteById(id);

        return rst > 0 ? "删除成功" : "删除失败";


    }


}
