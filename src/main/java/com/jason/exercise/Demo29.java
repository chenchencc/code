package com.jason.exercise;

import org.junit.Test;

import java.util.Stack;

public class Demo29 {

    Stack<Integer> in = new Stack<>();
    Stack<Integer> out = new Stack<>();

    public void push(Integer i){
        in.push(i);
    }

    public Integer pop(){
        if (out.isEmpty()){
            out.push(in.pop());
        }
        return out.pop();
    }

    public boolean isNull(){
        if (!out.isEmpty()){
            return false;
        }else {
            return in.isEmpty();
        }
    }


    @Test
    public void test(){
        Demo29 demo = new Demo29();
        demo.push(1);
        demo.push(2);
        demo.push(3);
        demo.push(4);
        while (!demo.isNull()){
            int a = demo.pop();
            System.out.println(a);
        }
    }
}
