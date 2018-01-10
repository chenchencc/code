package com.jason.ovviride;

public class Sub extends Super {
    public String name = "sub";

    public static void main(String[] args) {
        Super s =new Sub();
        System.out.println(s.name);
    }
}
