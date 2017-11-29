package com.jason.exercise;

import com.jason.common.Print;
import org.junit.Test;

public class Demo23 {

    /**
     * 合并排序，将两个已经排序的数组合并成一个数组，其中一个数组能容下两个数组的所有元素;
     * 思路：首先取出这两个数组中的元素，进行比较
     * @param a
     * @param b
     */
    public void merge(int[] a,int[] b){
        int[] t = new int[a.length+b.length];
        int i =0;
        int j = 0;
        int k = 0;
        while (i<a.length&&j<b.length){
            if (a[i]<b[j]){
                t[k++]= a[i];
                i++;
            }else {
                t[k++]=b[j];
                j++;
            }
        }
        if (i==a.length){
            while (j<b.length){
                t[k++] = b[j++];
            }
        }
        else{
             while (i<a.length){
                 t[k++] = a[i++];
             }
        }
        Print.print(t);
    }

    @Test
    public void test(){
        merge(new int[]{1,4,6,7},new int[]{2,3,7,9,11,13,15});
    }
}
