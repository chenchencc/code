package com.jason.designmodle.装饰器模式;

public interface Lists {
    Object get(int index);
    void remove(int index);
    void add(int index,Object value);
    void add(Object value);
}
