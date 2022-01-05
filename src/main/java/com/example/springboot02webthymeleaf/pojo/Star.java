package com.example.springboot02webthymeleaf.pojo;

import lombok.Data;

@Data
public class Star {
    private int id;
    private String name;
    private int age;
    private Partner partner;
}
