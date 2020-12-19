package com.tamiflu.learningweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.tamiflu.learningweb.mapper")
public class LearningwebApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearningwebApplication.class, args);
    }

}
