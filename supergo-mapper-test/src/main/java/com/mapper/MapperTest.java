package com.mapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.mapper.mapper")
public class MapperTest {
    public static void main(String[] args) {
        SpringApplication.run(MapperTest.class);
    }
}
