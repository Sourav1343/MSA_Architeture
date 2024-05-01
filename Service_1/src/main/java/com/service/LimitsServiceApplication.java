package com.service;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class LimitsServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(LimitsServiceApplication.class, args);

    }
}
