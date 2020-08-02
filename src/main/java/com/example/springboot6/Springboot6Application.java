package com.example.springboot6;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Springboot6Application {

    public static void main(String[] args) {
        //실행시키는 또다른 방법
           new SpringApplicationBuilder().sources(Springboot6Application.class).run(args);
//        SpringApplication app = new SpringApplication(Springboot6Application.class);
        //배너끄기
//        app.setBannerMode(Banner.Mode.OFF);
//        app.run(args);
    }
}
