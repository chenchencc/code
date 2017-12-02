package com.jason.exercise;

import com.jason.common.ListNode;

public class Demo28 {

    /**
     * 单链表反转
     * 思路一：
     * A->B->C->D
     * 先将A B之间的关系拆开
     * B的next指向A，依次进行下去
     */
    public ListNode reverse(ListNode root){
        if (root == null)
            return root;
        ListNode head = root;
        ListNode pre = null;
        ListNode next = null;
        while (head!=null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
