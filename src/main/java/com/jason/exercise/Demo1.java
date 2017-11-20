package com.jason.exercise;

import org.junit.jupiter.api.Test;

import java.util.Stack;

public class Demo1 {

    /**
     * 用两个栈实现一个队列 add pop peek
     * Stack1  Stack2
     * 注意要点：1.Stack1往Stack2中加入数据时，Stack2必须为空
     *          2.Stack1必须把所有的元素移到Stack2中，不能遗留下任何元素
     */

    private Stack<Integer> stack1 = null;
    private Stack<Integer> stack2 = null;

    public Demo1() {
        this.stack1 = new Stack<Integer>();
        this.stack2 = new Stack<Integer>();
    }

    public void add(int a){
        stack1.push(a);
//        stack1.add(a);
    }

    public Integer pop(){
        if (stack1.isEmpty()&&stack2.isEmpty()){
            throw new NullPointerException("The stack is empty");
        }else if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }


    public Integer peek(){
        if (stack1.isEmpty()&&stack2.isEmpty()){
            throw new NullPointerException("The stack is empty");
        }else if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }


    @Test
    public void test(){
       Demo1 d = new Demo1();
       d.add(1);
       d.add(2);
       d.add(3);
       d.add(4);

       int a = d.pop();
       int b = d.pop();
        System.out.println(a);
        System.out.println(b);
    }
}
