package com.jason.designmodle.装饰器模式;

public class ArrayLists implements Lists{

    private Object[] t;
    private int index = 0;

    public ArrayLists(Object[] t) {
        this.t = t;
    }

    public ArrayLists(){
        this.t = new Object[16];
    }

    @Override
    public Object get(int index) {
        if (index>=t.length)
            return null;
        else
            return t[index];
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void add(int index, Object value) {

    }

    @Override
    public void add(Object value) {

    }
}
