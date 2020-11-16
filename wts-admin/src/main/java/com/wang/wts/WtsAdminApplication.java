package com.wang.wts;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan("com.wang.wts.dao")
@SpringBootApplication
public class WtsAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(WtsAdminApplication.class, args);
    }

}
