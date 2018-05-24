package com.jason.designmodle.模板模式;

public class HeartBeatRequest extends Request{
    @Override
    String doHandle() {
        System.out.println("heartBeat request ");
        return "handle HeartBeat request";
    }
}
