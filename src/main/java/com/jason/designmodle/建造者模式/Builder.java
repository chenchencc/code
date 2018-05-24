package com.jason.designmodle.建造者模式;

public abstract class Builder {

    protected abstract void buildFxp(String fxp);
    protected abstract void buildTair(String tair);
    protected abstract void buildCd(String cd);

    protected abstract Car getResult();
}
