package org.example.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "org.example.mybatis.mapper")
@SpringBootApplication
public class MybatisApplication {

    public static void main(String[] args) {

        SpringApplication.run(MybatisApplication.class, args);
    }

}
