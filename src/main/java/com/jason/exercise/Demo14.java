package com.jason.exercise;

import com.jason.common.ListNode;
import org.junit.Test;

public class Demo14 {

    /**
     * 判断一个链表是否是环，思路：用两个变量 first = node.next  seconds = node.next.next
     * 当
     * @param node
     */
    public boolean isRing(ListNode node){
        if (node!=null){
            ListNode f = node;
            ListNode s = node;
            while (f!=null&&s!=null){
                f = f.next;
                s = s.next.next;
                if (s==f)
                    return true;
            }
        }
        return false;
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
        System.out.println(isRing(root1));
    }
}
