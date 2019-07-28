package com.czjk.api.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

import java.util.UUID;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan({"com.czjk.api.user.mapper"})
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
        //System.out.println(UUID.randomUUID().toString().replace("_",""));
    }
}
