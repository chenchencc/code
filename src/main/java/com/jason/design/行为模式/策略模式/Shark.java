package com.jason.design.行为模式.策略模式;

public class Shark implements JiaMiStrategy{


    @Override
    public String encrypt(String content) {
        //实现shark加密算法逻辑
        return "shark";
    }
}
