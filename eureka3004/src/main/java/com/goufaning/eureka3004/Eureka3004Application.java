package com.goufaning.eureka3004;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Eureka3004Application {

    public static void main(String[] args) {
        SpringApplication.run(Eureka3004Application.class, args);
    }

}
