package com.jason.Spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) throws Exception {
//        Resource resource = new ClassPathResource("spring/spring-context.xml");
//        BeanFactory factory = new XmlBeanFactory(resource);
//        BeanTest test = (BeanTest) factory.getBean("bean");
//        System.out.println(test.print("Jason"));

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/spring-context.xml");
        //context.getBean(SpringBeanLifeCycle.class);
    }
}
