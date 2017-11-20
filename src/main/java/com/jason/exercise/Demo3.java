package com.jason.exercise;

import org.junit.jupiter.api.Test;

import java.util.Stack;

/**
 * 用一个栈实现另一个栈的排序
 */
public class Demo3 {

    /**
     * 方式一
     * @param stack
     */
    public void sort(Stack<Integer> stack){
        Stack<Integer> help = new Stack<Integer>();
        while (!stack.isEmpty()){
            int our = stack.pop();
            while (!help.isEmpty()&&help.peek()>our){
                stack.push(help.pop());
            }
            help.push(our);
        }
        while (!help.isEmpty()){
            stack.push(help.pop());
        }
        stack.forEach(System.out::println);
    }


    public void sort2(Stack<Integer> stack){
        Stack<Integer> help = new Stack<>();
        while (!stack.isEmpty()){
            int out = stack.pop();
                while (!help.isEmpty()&&help.peek()>out){
                    stack.push(help.pop());
                }
                help.push(out);

        }
        while (!help.isEmpty()){
            stack.push(help.pop());
        }
    }

    @Test
    public void test(){
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(4);
        stack.push(1);
        stack.push(5);
        sort2(stack);
        stack.stream().forEach(System.out::print);
    }
}
