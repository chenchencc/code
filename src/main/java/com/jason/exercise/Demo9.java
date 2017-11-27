package com.jason.exercise;

import com.jason.common.DListNode;
import com.jason.common.ListNode;
import com.jason.common.TreeNode;
import org.junit.Test;

public class Demo9 {

    /**
     * 求一个环的个数
     */
    public int print(ListNode node){
        ListNode root = node;
        int count = 0;
        while (root!=null){
            count++;
            root = root.next;
            if (node==root)
                return count;
        }
        return count;
    }

    @Test
    public void test(){
        ListNode root1 = new ListNode("1");
        ListNode root2 = new ListNode("2");
        root1.next = root2;
        ListNode root3 = new ListNode("3");
        root2.next = root3;
        ListNode root4 = new ListNode("4");
        root3.next=root4;
        root4.next=root1;
        System.out.println(print(root1));

    }
}
