package com.bms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.bms.mapper")
public class BmsBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(BmsBackApplication.class, args);
    }

}
