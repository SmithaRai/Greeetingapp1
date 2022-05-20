package com.example.greetingapp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example.greetingapp1.repositary")
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class Greetingapp1Application {


    public static void main(String[] args) {
        SpringApplication.run(Greetingapp1Application.class, args);
    }
}
