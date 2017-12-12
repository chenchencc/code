package com.jason.mybatis;

import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Invocation;

import java.util.Properties;

public class JInterceptor implements Interceptor {
    /**
     * 而intercept方法就是要进行拦截的时候要执行的方法
     * @param invocation
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        return null;
    }

    /**
     * ，在plugin方法中我们可以决定是否要进行拦截进而决定要返回一个什么样的目标对象
     * @param target
     * @return
     */
    @Override
    public Object plugin(Object target) {
        return null;
    }

    /**
     * setProperties方法是用于在Mybatis配置文件中指定一些属性的。
     * @param properties
     */
    @Override
    public void setProperties(Properties properties) {

    }
}
