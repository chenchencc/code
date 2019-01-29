package com.jason.agent;

import java.lang.instrument.Instrumentation;

/**
 * https://blogs.oracle.com/ouchina/javaagent
 *
 * java agent 技术可以做哪些操作？
 * 1.可以做动态代理技术，在加载类时候更改类字节码
 * 2.
 */
public class JavaAgent {

    /**
     *
     * @param args
     * @param inst
     */
    public static void premain(String args,Instrumentation inst) {
        System.out.println("------------------method premain1 invoke------------------");
    }

    /**
     *
     * @param args
     */
    public static void premain(String  args) {
        System.out.println("------------------method premain2 invoke------------------");
    }


}
