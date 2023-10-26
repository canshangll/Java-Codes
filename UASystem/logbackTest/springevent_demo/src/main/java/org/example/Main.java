package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync //启动异步处理
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}