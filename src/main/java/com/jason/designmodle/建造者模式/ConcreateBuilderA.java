package com.jason.designmodle.建造者模式;

public class ConcreateBuilderA extends Builder{

    private Car car = new Car();
    @Override
    protected void buildFxp(String fxp) {
        car.setFxp(fxp);
    }

    @Override
    protected void buildTair(String tair) {
        car.setTair(tair);
    }

    @Override
    protected void buildCd(String cd) {
        car.setCd(cd);
    }

    @Override
    protected Car getResult() {
        return car;
    }
}
