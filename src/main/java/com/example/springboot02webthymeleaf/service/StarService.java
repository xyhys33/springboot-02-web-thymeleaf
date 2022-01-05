package com.example.springboot02webthymeleaf.service;


import com.example.springboot02webthymeleaf.dao.StarMapper;
import com.example.springboot02webthymeleaf.pojo.Star;
import lombok.Data;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Data
@Service//service层bean
public class StarService {
    @Resource//引用其他bean
    private StarMapper starMapper;

    public int insert(Star star) {
        return starMapper.insert(star);
    }

    //查询所有
    public List<Star> selectAll(){

        return starMapper.selectAll();
    }
    //通过ID查询
    public Star selectById(int id){

        return starMapper.selectById(id);
    }

    //通过ID删除
    public int deleteById(int id){
        return starMapper.deleteById(id);
    }
}
