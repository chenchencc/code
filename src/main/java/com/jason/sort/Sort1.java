package com.jason.sort;

import org.junit.jupiter.api.Test;

public class Sort1 {

    @Test
    public void bubble(){
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
            System.out.print(a[i]+" ");
        }
    }


    @Test
    public void quick(){
        int[] a = new int[]{3,5,1,3,6,8};
        quickSort(a,0,a.length-1);
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    private void quickSort(int[] a,int left,int right){
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
        quickSort(a,left,i-1);//继续处理左边的,这里是一个递归的过程
        quickSort(a,i+1,right);//继续处理右边的,这里是一个递归的过程
    }

}
