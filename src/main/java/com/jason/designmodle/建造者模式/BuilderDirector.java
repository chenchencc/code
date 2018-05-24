package com.jason.designmodle.建造者模式;

public class BuilderDirector {

    private Builder builder;

    public BuilderDirector(Builder builder) {
        this.builder = builder;
    }

    public Car get(){
        builder.buildFxp("fxp");
        builder.buildCd("cd");
        builder.buildTair("tair");
        return builder.getResult();
    }
}
