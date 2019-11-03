package com.test.gmall.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.test.gmall.user.mapper")
public class GmallUserApplication {

    public static void main(String[] args) {

        //http://user.gmall.com:8080/index1
        SpringApplication.run(GmallUserApplication.class, args);
    }

}
