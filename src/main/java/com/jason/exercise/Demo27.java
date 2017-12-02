package com.jason.exercise;

import com.jason.common.ListNode;
import org.junit.Test;

public class Demo27 {

    /**
     * 寻找链表倒数第K个元素
     * 思路：先将K做k--动作，然后再做K++操作,当k=0时，表明它是要寻找的元素前节点
     * @param node
     * @param k
     */
    public ListNode find(ListNode node,int k){
        if (node==null||k<1)
            return node;
        ListNode head = node;
        //k--
        while (head!=null){
            head = head.next;
            k--;
        }
        if (k>0)
            return node;
        if (k==0)
            return node;
        if (k<0){
            //k++
            ListNode first = node;
            while (first!=null&&k!=0){
                first = first.next;
                k++;
            }
            return first;
        }
        return node;
    }

    @Test
    public void test(){
        ListNode l1 = new ListNode("1");
        ListNode l2 = new ListNode("2");
        l1.next=l2;
        ListNode l3 = new ListNode("3");
        l2.next=l3;
        ListNode l4 = new ListNode("4");
        l3.next=l4;

        ListNode node = find(l1,0);
        System.out.println(node.name);
    }
}
