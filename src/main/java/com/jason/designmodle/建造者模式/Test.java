package com.jason.designmodle.建造者模式;

public class Test {

    public static void main(String[] args) {
        BuilderDirector director = new BuilderDirector(new ConcreateBuilderA());
        Car car = director.get();
        System.out.println(car);
    }
}
