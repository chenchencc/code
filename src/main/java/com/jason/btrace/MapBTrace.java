package com.jason.btrace;

import com.sun.btrace.annotations.*;

@BTrace
public class MapBTrace {

    /**
     *  ./btrace $pid MapBTrace.java  运行  $pid表示Java运行的进程ID
     *
     * 1、如果在HelloWorld.java里使用了JDK外的其他类，比如Netty的:
     * ./btrace -cp .:netty-all-4.0.41.Final.jar $pid MapBTrace.java
     * 2、结果输出到文件
     * ./btrace -o mylog $pid MapBTrace.java
     * @param map
     *
     * @ProbeClassName
     * @ProbeMethodName
     */
    @OnMethod(clazz = "java.util.HashMap",method = "put",location = @Location(Kind.ARRAY_GET))
    public void run(@Self java.util.HashMap map){

    }
}
