package com.jason.design.行为模式.策略模式;

public class Main {

    public static void main(String[] args) {
        //没有使用策略模式的方式
        JiaMiStrategy strategy = new MD5();
        System.out.println(strategy.encrypt("md5"));


        //使用策略模式
        StrategyContext context = new StrategyContext(new MD5());
        context.encrypt("md5");

        //比较学习一下
    }
}
