package com.jason.spring.aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopDemo {

    @Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        DemoService service = context.getBean(DemoService.class);
        service.test();
    }
}
