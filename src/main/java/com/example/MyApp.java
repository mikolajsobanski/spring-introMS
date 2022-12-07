package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyNameConfig.class);
        //applicationContext.register(MessageService.class);
        AnnotationConfigApplicationContext applicationContext2 = new AnnotationConfigApplicationContext(RandomTextConfig.class);


        MessageService messageService = applicationContext.getBean( MyNameMessageService.class);
        MessageService messageService2 = applicationContext2.getBean(RandomTextMessageService.class);
        System.out.println(messageService.getMessage());
        System.out.println(messageService.hashCode());
        System.out.println(messageService2.hashCode());

    }
}
