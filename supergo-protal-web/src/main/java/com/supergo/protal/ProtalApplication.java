package com.supergo.protal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.supergo.manager.feign")
public class ProtalApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProtalApplication.class);
    }
}
