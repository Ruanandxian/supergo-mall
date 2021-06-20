package com.supergo.manager;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.supergo.mapper")
public class ManagerService {
    public static void main(String[] args) {
        SpringApplication.run(ManagerService.class);
    }
}
