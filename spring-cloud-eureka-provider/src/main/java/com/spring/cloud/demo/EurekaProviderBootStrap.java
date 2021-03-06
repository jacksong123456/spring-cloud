package com.spring.cloud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author jacksong
 * Created by  on 2018/8/21
 */
@SpringBootApplication
@EnableDiscoveryClient
public class EurekaProviderBootStrap {
    public static void main(String[] args) {
        SpringApplication.run(EurekaProviderBootStrap.class, args);
    }
}
