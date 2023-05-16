package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class MainTest {
    private static ApplicationContext context;

    @BeforeAll
    public static void beforeAll(){
        context = new ClassPathXmlApplicationContext("spring-context.xml");
    }

    @Test
    public void test(){
        System.out.println(context.getBeanDefinitionCount());
    }
}