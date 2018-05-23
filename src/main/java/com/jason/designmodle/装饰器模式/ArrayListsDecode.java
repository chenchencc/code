package com.jason.designmodle.装饰器模式;

/**
 * 装饰器的目的就是为了给目标方法添加一些新的功能
 */
public class ArrayListsDecode implements Lists{

    //关键点
    private Lists lists;

    public ArrayListsDecode(Lists lists) {
        this.lists = lists;
    }

    @Override
    public Object get(int index) {
        System.out.println("index----"+index);
        return lists.get(index);
    }

    @Override
    public void remove(int index) {
        System.out.println("index----"+index);
        lists.remove(index);
    }

    @Override
    public void add(int index, Object value) {
        System.out.println("index----"+index);
        lists.add(index,value);
    }

    @Override
    public void add(Object value) {
        System.out.println("index----"+value);
        lists.add(value);
    }
}
