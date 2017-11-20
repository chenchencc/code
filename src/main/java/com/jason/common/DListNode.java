package com.jason.common;

public class DListNode {
    public DListNode next;
    public DListNode pre;
    public String name;
    public int size;

    public DListNode(DListNode next, DListNode pre) {
        this.next = next;
        this.pre = pre;
    }

    public DListNode(String name) {
        this.name = name;
    }

    public DListNode(int size) {
        this.size = size;
    }
}
