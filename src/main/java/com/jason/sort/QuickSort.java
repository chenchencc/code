package com.jason.sort;

import org.junit.jupiter.api.Test;

public class QuickSort {

    /**
     * quick sort
     *时间复杂度：最差时间复杂度O(N*N),它的平均时间复杂度为 O (NlogN)
     * 假设我们现在对“6 1 2 7 9 3 4 5 10 8”这 10 个数进行排序。首先在这个序列中随
     便找一个数作为基准数(不要被这个名词吓到了,这就是一个用来参照的数,待会儿你就知
     道它用来做啥了)。为了方便,就让第一个数 6 作为基准数吧。接下来,需要将这个序列中
     所有比基准数大的数放在 6 的右边,比基准数小的数放在 6 的左边,类似下面这种排列。
     */
    @Test
    public void test(){
        int[] a = new int[]{3,5,1,3,6,8};
        quicksort(a,0,a.length-1);
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    void quicksort(int[] a,int left,int right)
    {
        int i,j,t,temp;
        if(left>right)
            return;
        temp=a[left]; //temp中存的就是基准数
        i=left;
        j=right;
        while(i!=j)
        {//顺序很重要,要先从右往左找
            while(a[j]>=temp && i<j)
                j--;//再从左往右找
            while(a[i]<=temp && i<j)
                i++;//交换两个数在数组中的位置
            if(i<j)//当哨兵i和哨兵j没有相遇时
            {
                t=a[i];
                a[i]=a[j];
                a[j]=t;
            }
        }//最终将基准数归位
        a[left]=a[i];
        a[i]=temp;
        quicksort(a,left,i-1);//继续处理左边的,这里是一个递归的过程
        quicksort(a,i+1,right);//继续处理右边的,这里是一个递归的过程
    }
}
