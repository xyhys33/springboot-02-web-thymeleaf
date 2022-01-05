package com.example.springboot02webthymeleaf;

import com.example.springboot02webthymeleaf.pojo.Partner;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot02WebThymeleafApplicationTests {
    @Autowired
    private Partner partner;
    @Test
    void contextLoads() {
        System.out.println(partner);
    }

}
