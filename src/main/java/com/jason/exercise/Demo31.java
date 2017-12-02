package com.jason.exercise;

import com.jason.common.Print;
import org.junit.Test;

public class Demo31 {

    /**
     * 快速排序
     */
    @Test
    public void quick(){
        int[] a = {4,8,9,0,1,3,2,5,12,10,7,5};
//        int[] a = {1,2,3,4,6,7,7,9,11,13,15};
        quickSort(a,0,a.length-1);
        Print.print(a);
    }

    public void quickSort(int[] a,int left,int right){
        if (left>right)
            return;
        int i = left;
        int j = right;
        int t = a[left];
        while (i!=j){
            while (i<j&&a[j]>=t)
                j--;
            while (i<j&&a[i]<=t)
                i++;
            if (i<j){
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
            }
        }
        a[left] = a[i];
        a[i] = t;
        quickSort(a,left,i-1);
        quickSort(a,i+1,right);
    }
}
