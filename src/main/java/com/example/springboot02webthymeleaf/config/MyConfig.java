package com.example.springboot02webthymeleaf.config;

import com.example.springboot02webthymeleaf.pojo.Partner;
import com.example.springboot02webthymeleaf.pojo.Star;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    //访问权限修饰符没有强制要求，一般是protected
    //返回值就是注入到Spring容器中实例类型。
    // 方法名没有强制要求,相当于<bean >中id属性。
    @Bean("star")
   public Star getStar(Partner partner){
        partner.setName("无情帅宇");
        Star star =new Star();
        star.setPartner(partner);
        return star;

    }
    @Bean
    public Partner getPartner(){
        return new Partner();
    }
}