package com.jason.sort;

import com.jason.common.Print;
import org.junit.jupiter.api.Test;

public class Sort2 {

    @Test
    public void select(){
       int[] a = new int[]{2,6,2,8,74};
       for (int i=0;i<a.length;i++){
           int min =i;
           for (int j=i+1;j<a.length;j++){
               if (a[min]>a[j])
                   min = j;
           }
           int t = a[i];
           a[i] = a[min];
           a[min] = t;
       }
       Print.print(a);
    }

    @Test
    public void selec2(){
        int[] a = new int[]{2,6,2,8,74};
        for (int i=0;i<a.length;i++){
            int min = i;
            for (int j=i+1;j<a.length;j++){
                if (a[min]>a[j])
                    min = j;
            }
            int t = a[i];
            a[i] = a[min];
            a[min] = t;
        }
        Print.print(a);
    }

    @Test
    public void bubble(){
        int[] a = new int[]{2,6,2,8,74};
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length-i-1;j++){
                if (a[j]>a[j+1]){
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
        }
        Print.print(a);
    }

    @Test
    public void insert(){
        int[] arr = new int[]{2,6,2,8,74};
        for (int i=1;i< arr.length;i++){
            int t = arr[i];
            int j = 0;
            for (j=i;j>0&&arr[j-1]>t;j--){
                arr[j] = arr[j-1];
            }
            arr[j] = t;
        }
        Print.print(arr);
    }

    @Test
    public void shell(){
        int[] a = new int[]{2,6,2,8,74};
        int h = 1;
        while(h<a.length/3)
            h = 3*h+1;
        while(h>=1){
            for(int i=h;i<a.length;i++){
                for(int j=i;j>=h&&a[j]>a[j-h];j-=h){
                    int t = a[j];
                    a[j] = a[j-h];
                    a[j-h] = t;
                }
            }
            h = h/3;
        }
    }

    @Test
    public void quick(){
        int[] a = new int[]{2,6,2,8,74};
        quicksort(a,0,a.length-1);
    }

    public void quicksort(int[] a,int left,int right) {
        int i, j, t, temp;
        if (left > right)
            return;
        temp = a[left]; //temp中存的就是基准数
        i = left;
        j = right;
        while (i != j) {//顺序很重要,要先从右往左找
            while (a[j] >= temp && i < j)
                j--;//再从左往右找
            while (a[i] <= temp && i < j)
                i++;//交换两个数在数组中的位置
            if (i < j)//当哨兵i和哨兵j没有相遇时
            {
                t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }//最终将基准数归位
        a[left] = a[i];
        a[i] = temp;
        quicksort(a, left, i - 1);//继续处理左边的,这里是一个递归的过程
        quicksort(a, i + 1, right);//继续处理右边的,这里是一个递归的过程
    }

    @Test
    public void mergeSort(){
        int[] a = new int[]{2,6,2,8,74};
        sort(a,0,a.length-1);
    }

    public void sort(int[] a,int low,int high){
        int mid = (low+high)/2;
        if(low<high){
            sort(a,low,mid);
            sort(a,mid+1,high);
            //左右归并
            merge(a,low,mid,high);
        }
    }

    private void merge(int[] a, int low, int mid, int high) {
        int[] temp = new int[high-low+1];
        int i= low;
        int j = mid+1;
        int k=0;
        // 把较小的数先移到新数组中
        while(i<=mid && j<=high){
            if(a[i]<a[j]){
                temp[k++] = a[i++];
            }else{
                temp[k++] = a[j++];
            }
        }
        // 把左边剩余的数移入数组
        while(i<=mid){
            temp[k++] = a[i++];
        }
        // 把右边边剩余的数移入数组
        while(j<=high){
            temp[k++] = a[j++];
        }
        // 把新数组中的数覆盖nums数组
        for(int x=0;x<temp.length;x++){
            a[x+low] = temp[x];
        }
    }
}
