package com.supergo.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.supergo.manager.feign")
public class ManagerWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(ManagerWebApplication.class);
    }
}
