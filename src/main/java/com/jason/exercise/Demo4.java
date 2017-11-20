package com.jason.exercise;

import com.jason.common.ListNode;
import org.junit.jupiter.api.Test;

public class Demo4 {

    /**
     * 找出两个有序链表的公共部分
     * @param fisrt
     * @param another
     */
    public void search(ListNode fisrt,ListNode another){
        if (fisrt!=null&&another!=null){
           while (fisrt!=null&&another!=null){
               if (fisrt.size>another.size)
                   another = another.next;
               else if (fisrt.size<another.size)
                   fisrt = fisrt.next;
               else{
                   System.out.println(fisrt.size);
                   fisrt = fisrt.next;
                   another = another.next;
               }
           }
        }
    }

    @Test
    public void test(){
        ListNode f1 = new ListNode(2);
        ListNode f2 = new ListNode(3);
        f1.next=f2;
        ListNode f3 = new ListNode(6);
        f2.next=f3;
        ListNode f4 = new ListNode(9);
        f3.next=f4;

        ListNode a1 = new ListNode(3);
        ListNode a2 = new ListNode(7);
        a1.next=a2;
        ListNode a3 = new ListNode(9);
        a2.next=a3;
        search(f1,a1);
    }
}
