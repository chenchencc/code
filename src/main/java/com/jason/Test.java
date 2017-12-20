package com.jason;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        TreeMap<P,P> map = new TreeMap<>();
        P p1 = new P("j",1);
        P p2 = new P("k",2);
        P p3 = new P("l",3);

//        map.put(p1,p1);
//        map.put(p2,p2);
        //map.put(null,p3);

        LinkedHashMap mm = new LinkedHashMap();
        HashSet<String> set = new HashSet<>();
        set.add("aaa");
        System.out.println(set.add("aaa"));
    }
}
class P{
    String name;
    int age;

    public P(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
