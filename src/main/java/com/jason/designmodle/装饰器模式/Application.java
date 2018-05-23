package com.jason.designmodle.装饰器模式;

public class Application {

    public static void main(String[] args) {
        Lists lists = new ArrayLists();
        Lists lists1 = new ArrayListsDecode(lists);

    }
}
