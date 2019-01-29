package com.jason.designmodle.访问者模式;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcreateSubject implements Subject{

    private List<Observer> observerList = new CopyOnWriteArrayList<>();


    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        observerList.stream().forEach(Observer::update);
    }
}
