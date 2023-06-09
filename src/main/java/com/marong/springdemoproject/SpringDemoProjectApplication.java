package com.marong.springdemoproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.marong.springdemoproject.Mapper")
public class SpringDemoProjectApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringDemoProjectApplication.class, args);

    }

}
