package com.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication {

    public static void main(String[] args) {
        String password="Bhushan@123";
        SpringApplication.run(HelloWorldApplication.class, args);
    }

}
