package com.jason.exercise;

import com.jason.common.DListNode;
import com.jason.common.ListNode;
import com.sun.org.apache.bcel.internal.generic.DLOAD;
import org.junit.Test;

import java.util.Stack;

public class Demo6 {


    /**
     * 单向链表反转-借助栈来实现
     * @param node
     */
    public ListNode reverse(ListNode node){
        Stack<ListNode> stack = new Stack<>();
        ListNode root = node;
        while (root!=null){
            stack.push(root);
            root = root.next;
        }

        ListNode head = stack.pop();
        ListNode r = head;
        while (!stack.isEmpty()){
            ListNode t = stack.pop();
            t.next = null;
            if (head!=null){
                head.next = t;
            }
            head = t;
        }
        return r;
    }

    /**
     * 利用自身进行转换
     * A -> B -> C -> D
     * 第一步：将A、B分开，然后将A赋给B.next
     * 第二步：依次下去即可
     *
     * @param head
     */
    public ListNode rerverse2(ListNode head){
        ListNode pre = null;
        ListNode next = null;
        while (head!=null){
           next = head.next;
           head.next=pre;
           pre = head;
           head = next;
        }
        return pre;
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
       /* ListNode t = reverse(root1);
        while (t!=null){
            System.out.println(t.name);
            t = t.next;
        }*/
       ListNode r = reverse3(root1);
       while (r!=null){
           System.out.println(r.name);
           r = r.next;
       }
    }

    /**
     *
     */
    public ListNode reverse3(ListNode root){
        ListNode pre = null;
        ListNode next = null;
        while (root!=null){
            next = root.next;
            root.next = pre;
            pre = root;
            root = next;
        }
        return pre;
    }

    /**
     * 反转双向链表
     * @param root
     */
    public DListNode reverseDList(DListNode root){
        if (root!=null){
            DListNode pre = null;
            DListNode next = null;
            while (root!=null){
                next = root.next;
                root.next = pre;
                root.pre = next;
                pre = root;
                root = next;
            }
            return pre;
        }
        return root;
    }

    @Test
    public void test2(){
     DListNode node1 = new DListNode("1");
     DListNode node2 = new DListNode("2");
     node1.next = node2;
     node2.pre = node1;
     DListNode node3 = new DListNode("3");
     node2.next = node3;
     node3.pre = node2;
     DListNode node4 = new DListNode("4");
     node3.next=node4;
     node4.pre=node3;
     DListNode root = reverseDList(node1);
     while (root!=null){
         System.out.println(root.name);
         root = root.next;
     }
    }
}
