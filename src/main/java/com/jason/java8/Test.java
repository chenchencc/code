package com.jason.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    @org.junit.Test
    public void map(){
        List<String> li = null;
        Optional.ofNullable(li).ifPresent(l->{l.stream().forEach(System.out::print);});
    }
}
