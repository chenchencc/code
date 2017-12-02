package com.jason.exercise;

import com.jason.common.ListNode;

import java.util.Stack;

public class Demo40 {

    /**
     * 输入个链表的头结点，从尾到头反过来打印出每个结点的值
     */
    public void reverse(ListNode node){
        Stack<ListNode> stack = new Stack<>();
        if (node!=null){
            ListNode root = node;
            while (root!=null){
                stack.push(root);
                root = root.next;
            }
        }

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }

    }
}
