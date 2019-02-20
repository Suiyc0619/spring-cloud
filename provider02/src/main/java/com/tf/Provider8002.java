package com.tf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Provider8002 {

    public static void main(String[] args) {
        SpringApplication.run(Provider8002.class,args);
    }
}