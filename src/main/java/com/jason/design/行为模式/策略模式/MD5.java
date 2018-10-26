package com.jason.design.行为模式.策略模式;

public class MD5 implements JiaMiStrategy{
    @Override
    public String encrypt(String content) {
        //实现md5解密逻辑
        return "MD5";
    }
}
