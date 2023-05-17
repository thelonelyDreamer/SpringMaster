package org.example;

import org.example.factory.UserInstanceFactory;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class MainTest {
    private static ApplicationContext context;
    private static final Logger log = LoggerFactory.getLogger(MainTest.class);

    @BeforeAll
    public static void beforeAll(){
        context = new ClassPathXmlApplicationContext("spring-context.xml");
    }

    @Test
    public void test(){
        System.out.println(context.getBeanDefinitionCount());
        UserInstanceFactory factory = context.getBean("userFactory", UserInstanceFactory.class);
        factory.createUser();
        log.info("hello");
    }
}