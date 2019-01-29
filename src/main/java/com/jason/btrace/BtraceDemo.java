/*


        */
package com.jason.btrace;

import com.sun.btrace.BTraceUtils;
import com.sun.btrace.annotations.*;

@BTrace
public class BtraceDemo{

    /**
     *
     */
    @OnMethod(clazz="java.lang.Thread", method="start")
    public static void onThreadStart() {
        int length = BTraceUtils.$length();
        System.out.println("thread start!");

    }


    @OnMethod(clazz = "java.util.HashMap",
            method = "put",
            location = @Location(Kind.ARRAY_GET))
    //@Location(Kind.RETURN)//函数返回的时候执行，如果不填，则在函数开始的时候执行
    public void run(@Self java.util.HashMap map){

    }
}
