package org.example;

import org.example.pojo.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-context.xml");
        Arrays.stream(context.getBeanNamesForType(User.class)).forEach(System.out::println);
    }
}