package com.example.springboot02webthymeleaf.dao;


import com.example.springboot02webthymeleaf.pojo.Star;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//@Repository//dao层dao
@Mapper
public interface StarMapper {
    int insert(Star record);
    List<Star> selectAll();
    Star selectById(int id);
    int deleteById(int id);
}


