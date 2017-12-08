package com.jason.exercise;

import com.jason.common.ListNode;
import org.junit.Test;

public class Demo15 {

    /**
     * 反转部分链表
     * A -> B -> C -> D -> E
     *再写一个，给你一个链表和一个整数k（k大于等于0，小于等于链表长度，链表长度未知），
     *按k步长反转链表（比如1->2->3->4->5->6->7，当k=3的时候结果是3->2->1->6->5->4->7)
     */
    public void reverse(ListNode root){

    }

    @Test
    public void test(){
        Long.parseLong("6901443071135");
        long l = Long.valueOf("6948210259105").longValue();
        System.out.println(l);

        for (int i=0;i<4;i++){
            if (i == 2)
                continue;
            System.out.println(i);
        }
    }
}
