package com.jason.common;

public class Print {
    public static void print(int[] a){
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void print(DListNode node){
        while (node!=null){
            System.out.print(node.size);
            System.out.print(" ");
            node = node.next;
        }
        System.out.println();
    }

    public static void print(ListNode node){
        while (node!=null){
            System.out.print(node.size);
            System.out.print(" ");
            node = node.next;
        }
        System.out.println();
    }
}
