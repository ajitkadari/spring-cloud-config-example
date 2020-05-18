package org.example.spring.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConfigClientApplication {

    @Value("${red.message}")
    private String message;

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }
}
