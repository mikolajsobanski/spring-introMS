package com.example;


public class MyNameMessageService implements MessageService {
    private String myName = "Mikolaj Sobanski";


    @Override
    public String getMessage() {
        return myName;
    }
}
