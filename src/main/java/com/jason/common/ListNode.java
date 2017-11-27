package com.jason.common;

public class ListNode {
    public String name;
    public ListNode next;
    public int size;

    public ListNode(int size) {
        this.size = size;
    }

    public ListNode(String name) {
        this.name = name;
    }

    public ListNode() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListNode listNode = (ListNode) o;

        if (size != listNode.size) return false;
        if (name != null ? !name.equals(listNode.name) : listNode.name != null) return false;
        return next != null ? next.equals(listNode.next) : listNode.next == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (next != null ? next.hashCode() : 0);
        result = 31 * result + size;
        return result;
    }
}
