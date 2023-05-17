package org.example.bean;

import org.springframework.beans.factory.InitializingBean;

public class MyBean implements InitializingBean {
    private  String name;
    {
        System.out.println("这是匿名代码块");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("执行 InitializingBean 的 afterPropertiesSet");
    }

//    @PostConstruct javax标准
    public void postConstruct(){
        System.out.println("执行 postConstruct()方法");
    }
}
