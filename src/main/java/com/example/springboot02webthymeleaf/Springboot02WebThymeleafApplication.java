package com.example.springboot02webthymeleaf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@MapperScan(basePackages = "com.example.springboot02webthymeleaf.dao") //扫描对应包下的所有mapper注解
public class Springboot02WebThymeleafApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot02WebThymeleafApplication.class, args);
    }

}
