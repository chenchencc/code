package com.jason.exercise;

import com.jason.common.DListNode;
import com.jason.common.ListNode;
import com.sun.org.apache.bcel.internal.generic.DLOAD;
import org.junit.jupiter.api.Test;

import java.util.Stack;

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
            //System.out.println(node.size);
            if (turn == k){
                node = node.next.next;
            }else {
                node = node.next;
            }
            turn++;
        }
    }

    public ListNode remove3(ListNode node,int k){
        if (node==null||k<1)
            return node;
        int count = 0;
        ListNode tmp = node;
        while (tmp!=null){
            count++;
            tmp = tmp.next;
        }

        ListNode head = node;
        if (k>count)
            return node;
        int turn = 1;
        while (turn!=count-k){
            head = head.next;
            turn++;
        }
        head.next = head.next.next;
        return node;
    }

    /**
     * 方式二：从头遍历值尾，K值以此做减法
     * 根据K值来进行判断
     * k=0:删除头节点 返回head.next
     * k>0:说明没有那么多元素 直接返回head
     * k<0:再从头开始遍历，K++操作
     *
     */
    public ListNode remove2(ListNode node,int k){
        if (node==null||k<1)
            return node;
        ListNode cur = node;
        while (cur!=null){
            k--;
            cur = cur.next;
        }
        if (k == 0){
            return node.next;
        }
        if (k>0)
            return node;
        if (k<0){
            cur = node;
            while (++k!=0){
                cur = cur.next;
            }
            cur.next = cur.next.next;
        }
        return node;
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
//        ListNode n = remove2(f1,3);
        ListNode n = remove3(f1,3);
        while (n!=null){
            System.out.println(n.size);
            n = n.next;
        }
    }

    @Test
    public void test1(){
        DListNode f1 = new DListNode(2);
        DListNode f2 = new DListNode(3);
        f1.next=f2;
        f1.pre=null;
        DListNode f3 = new DListNode(4);
        f2.next=f3;
        f2.pre=f1;
        DListNode f4 = new DListNode(7);
        f3.next=f4;
        f3.pre=f2;
        DListNode f5 = new DListNode(9);
        f4.next=f5;
        f4.pre=f3;
        DListNode f6 = new DListNode(10);
        f5.next=f6;
        f5.pre=f4;
        DListNode n= removeDList2(f2,2);
        while (n!=null){
            System.out.println(n.size);
            n = n.next;
        }
    }

    /**
     * 删除双链表中第k个元素
     * 方式一：遍历所有的元素求总元素个数N  删除第N-k+1位置的元素
     * 先k--,再k++,k=0时是要删除元素的前节点
     */
    public DListNode removedoubleListNode(DListNode node,int k){
        if (node==null||k<1)
            return node;
        DListNode cur = node;
        while (cur!=null){
            k--;
            cur = cur.next;
        }
        if (k == 0){
             cur = node.next;
             cur.pre=null;
        }
        if (k>0)
            return node;
        if (k<0){
            cur = node;
            while (++k!=0){
                cur = cur.next;
            }
            DListNode next = cur.next.next;
            cur.next=next;
            if (next!=null){
                next.pre=cur;
            }
        }
        return node;
    }

    /**
     * 通过栈来实现
     * @param node
     * @param k
     */
    public void removeDList(DListNode node,int k){

    }

    /**
     * @param node
     * @param k
     */
    public DListNode removeDList2(DListNode node,int k){
        if (node==null||k<1)
            return node;
        int count = 0;
        DListNode t = node;
        DListNode last = node;
        while (t!=null){
            t = t.next;
            if (t!=null)
                last = t;
        }
        return node;

    }

}
