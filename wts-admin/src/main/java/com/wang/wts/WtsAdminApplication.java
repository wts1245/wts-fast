package com.wang.wts;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@MapperScan("com.wang.wts.dao")
@SpringBootApplication
@EnableSwagger2
public class WtsAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(WtsAdminApplication.class, args);
    }

}
