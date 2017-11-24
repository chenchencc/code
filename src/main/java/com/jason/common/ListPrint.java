package com.jason.common;

public class ListPrint {

    public static void print(ListNode node){
        while (node!=null){
            System.out.print(node.size);
            System.out.print(" ");
            node = node.next;
        }
        System.out.println();
    }
}
