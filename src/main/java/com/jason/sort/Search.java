package com.jason.sort;

import org.junit.Test;
public class Search {

    /**
     * 二分法查找的前提是：数组必须是有序的
     */

    //循环
    public int getPos(int[] a,int val){
        int l = 0;
        int h = a.length;
        while(l<=h){
            int mid = (l+h)/2;
            if(a[mid]>val)
                h = mid;
            if(a[mid] <val)
                l = mid;
            return mid;
        }
        return -1;
    }
    //递归
    public int getPos(int[] a,int val,int l,int h){
        int mid = (l+h)/2;
        if(a[mid]>val)
            getPos(a, val, l, mid);
        if(a[mid]<val)
            getPos(a, val,mid,h);
        return mid;
    }

    @Test
    public void test(){
        int[] a = new int[]{1,5,6,7,8,10};
        int index = getPos(a,7);
        System.out.println(index);
    }
}
