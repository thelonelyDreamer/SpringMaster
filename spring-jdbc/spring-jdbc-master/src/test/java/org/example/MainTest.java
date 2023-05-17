package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.*;


//@ExtendWith(SpringExtension.class)
//@SpringJUnitConfig(locations ="classpath:application.xml" )
@ContextConfiguration(classes = Main.class)
@SpringJUnitConfig
class MainTest {
    @Autowired
    private ApplicationContext context;

    @Test
    public void test(){
        System.out.println(context.getBeanDefinitionCount());
    }
}