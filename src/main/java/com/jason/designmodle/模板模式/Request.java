package com.jason.designmodle.模板模式;

public abstract class Request {

    public void handle(){
        String result = doHandle();
        System.out.println(result);
    }

    abstract String doHandle();
}
