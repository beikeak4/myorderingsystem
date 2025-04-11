package com.southwind;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.southwind.repository")
public class Account2Application {
    public static void main(String[] args) {
        SpringApplication.run(Account2Application.class,args);
    }
}
