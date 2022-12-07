package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyNameConfig {
    @Bean
    public MyNameMessageService myName(){
        return new MyNameMessageService();
    }
}
