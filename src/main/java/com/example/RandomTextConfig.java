package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RandomTextConfig {

    @Bean
    public RandomTextMessageService myRandom(){
        return new RandomTextMessageService();
    }
}
