package com.zq.testmybaits.mybaitsxml;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zq.testmybaits.mybaitsxml.repository")
public class TestmybaitsApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestmybaitsApplication.class, args);
    }

}
