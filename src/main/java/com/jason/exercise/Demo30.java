package com.jason.exercise;

import org.junit.Test;

public class Demo30 {

    /**
     * 二分法查找的前提是给定数组必须有序
     * @param a
     * @param i
     * @return
     */
    public int binarySearch(int[] a,int i){
        int start = 0;
        int end = a.length-1;
        while (start<=end){
            int mid = (start+end)>>1;
            if (a[mid]>i)
                end = mid;
            if (a[mid]<i)
                start = mid;
            if (a[mid]==i)
                return mid;
        }
        return -1;
    }

    @Test
    public void test(){
        int[] a = {1,2,3,4,6,7,7,9,11,13,15};
        System.out.println(binarySearch(a,7));
    }
}
