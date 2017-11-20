package com.jason.exercise;

import com.jason.common.ListNode;
import org.junit.jupiter.api.Test;

//在单链表和双链表中删除倒数第k个元素
public class Demo5 {

    /**
     * 方式一：当总的链表长度为N，删除元素的前一个元素是N-k 首先遍历出总的元素个数
     * @param node
     * @param k
     */
    public void remove(ListNode node,int k){
        if (node==null||k<1)
            return;
        int count = 0;
        ListNode tmp = node;
        while (tmp!=null){
            count++;
            tmp = tmp.next;
        }

        if (k>count)
            return;
        int turn = 1;
        while (turn<=count&&node!=null){
            if (turn == k){
                node.next = node.next.next;
                return;
            }else
                node = node.next;
        }

    }


    @Test
    public void test(){
        ListNode f1 = new ListNode(2);
        ListNode f2 = new ListNode(3);
        f1.next=f2;
        ListNode f3 = new ListNode(4);
        f2.next=f3;
        ListNode f4 = new ListNode(7);
        f3.next=f4;
        ListNode f5 = new ListNode(9);
        f4.next=f5;
        ListNode f6 = new ListNode(10);
        f5.next=f6;
        remove(f1,3);
        while (f1!=null){
            System.out.println(f1.size);
            f1 = f1.next;
        }
    }

}
