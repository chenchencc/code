package com.jason.java8;

import java.util.ArrayList;
import java.util.List;

public class Test {

    @org.junit.Test
    public void test(){
        List<Integer> li = new ArrayList<>();
        li.add(2);
        li.add(4);
        li.add(1);
        long s = li.stream().reduce((a,b)->a+b).get();
        System.out.println(s);
    }
}
