package com.example.bookapp.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer { //Web設定ルールに渡して
    @Override
    public void addCorsMappings(CorsRegistry registry) {//Web設定ルールの一部をOverrideで上書き利用
        registry.addMapping("/**")//CORS設定適用範囲指定
                .allowedOrigins("http://localhost:3000", "http://localhost:5173")
                .allowedMethods("GET", "POST", "PUT", "DELETE");
                //localhost:3000、5173からのGET, POST, PUT, DELETE通信を許可
    }


}