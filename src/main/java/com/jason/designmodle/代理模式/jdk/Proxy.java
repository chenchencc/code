package com.jason.designmodle.代理模式.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Proxy {

    private Object target;

    public Proxy(Object target) {
        this.target = target;
    }

    public void proxy(Class inteface){
        java.lang.reflect.Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{inteface}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return method.invoke(target,args);
            }
        });
    }
}
