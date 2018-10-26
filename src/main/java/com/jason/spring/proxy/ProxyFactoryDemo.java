package com.jason.spring.proxy;

import org.junit.Test;
import org.springframework.aop.framework.ProxyFactory;

public class ProxyFactoryDemo {

    @Test
    public void test(){
        Target target = new Target();
        ProxyFactory proxyFactory = new ProxyFactory(target);
        proxyFactory.getProxy();
    }

    public void methodInterceptor(){

    }
}
