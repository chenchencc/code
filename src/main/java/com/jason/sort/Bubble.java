package com.jason.sort;

import org.junit.jupiter.api.Test;

public class Bubble {

    /**
     * 冒泡排序  时间复杂度是 O(N*N )
     *
     * 冒泡排序的基本思想是:每次比较两个相邻的元素,如果它们的顺序错误就把它们交换
     过来。
     */
    @Test
    public void bubble(){
        int[] a = new int[]{3,5,1,3,6,8};
        for(int i=0;i<a.length-1;i++) //n个数排序,只用进行n-1趟
        {
            for(int j=0;j<a.length-i-1;j++) //从第1位开始比较直到最后一个尚未归位的数,想一想为什么到n-i就可以了。
            {
                if(a[j]<a[j+1]) //比较大小并交换
                { int t=a[j]; a[j]=a[j+1]; a[j+1]=t; }
            }
        }

        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+"  ");
        }
    }

    @Test
    public void test(){
        int[] a = new int[]{3,5,1,3,6,8};
        for (int i=0;i<a.length-1;i++){
            for (int j=0;j<a.length-i-1;j++){
                if (a[j]>a[j+1]){
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
        }
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+"  ");
        }
    }
}
