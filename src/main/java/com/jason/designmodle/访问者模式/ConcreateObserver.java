package com.jason.designmodle.访问者模式;

public class ConcreateObserver implements Observer{

    private Subject subject;

    public void register(){
        subject.addObserver(this);
    }

    @Override
    public void update() {

    }
}
