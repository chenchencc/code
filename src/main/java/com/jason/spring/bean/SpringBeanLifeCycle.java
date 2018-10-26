package com.jason.spring.bean;

import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.beans.PropertyDescriptor;

/**
 * 测试Spring中的bean的生命周期、已经
 */
public class SpringBeanLifeCycle implements ApplicationContextAware,InitializingBean,DisposableBean,BeanFactoryAware,BeanFactoryPostProcessor,BeanPostProcessor,InstantiationAwareBeanPostProcessor,BeanNameAware{

    private ApplicationContext applicationContext;

    private BeanFactory beanFactory;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
        System.out.println("ApplicationContextAware.....");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) {
        this.beanFactory = beanFactory;
        System.out.println("BeanFactoryAware.....");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("BeanNameAware......");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean......");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean....");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) {
        System.out.println("BeanFactoryPostProcessor.....");
    }

    @Override
    public Object postProcessBeforeInstantiation(Class<?> aClass, String s) {
        System.out.println("BeanPostProcessor...before");
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object o, String s) {
        System.out.println("BeanPostProcessor...after");
        return false;
    }

    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues propertyValues, PropertyDescriptor[] propertyDescriptors, Object o, String s)  {
        System.out.println("InstantiationAwareBeanPostProcessor....values");
        return null;
    }

    @Override
    public Object postProcessBeforeInitialization(Object o, String s)  {
        System.out.println("InstantiationAwareBeanPostProcessor....before");
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) {
        System.out.println("InstantiationAwareBeanPostProcessor....after");
        return null;
    }


    public void init(){
        System.out.println("init.....");
    }

    public void destoryed(){
        System.out.println("end.....");
    }
}
