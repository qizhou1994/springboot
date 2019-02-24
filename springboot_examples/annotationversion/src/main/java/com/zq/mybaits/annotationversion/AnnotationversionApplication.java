package com.zq.mybaits.annotationversion;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zq.mybaits.annotationversion.mapper")
public class AnnotationversionApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnnotationversionApplication.class, args);
    }

}
