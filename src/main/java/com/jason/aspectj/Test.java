package com.jason.aspectj;

import com.jason.aspectj.bo.CustomerBo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    @org.junit.Test
    public void test(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/spring-context.xml");
        CustomerBo bo = ctx.getBean(CustomerBo.class);
        bo.addCustomer();
    }
}
