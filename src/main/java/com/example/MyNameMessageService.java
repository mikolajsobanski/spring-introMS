package com.example;

import org.springframework.stereotype.Component;

@Component("messageService")
public class MyNameMessageService implements MessageService {
    private String myName = "Mikolaj Sobanski";

    @Override
    public String getMessage() {
        return myName;
    }
}
