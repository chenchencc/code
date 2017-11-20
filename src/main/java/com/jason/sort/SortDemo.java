package com.jason.sort;

import org.junit.jupiter.api.Test;

//计数排序、基数排序、插入排序、归并排序和堆排序
public class SortDemo {

    @Test
    public void buble(){
        int[] a = new int[]{3,5,1,3,6,8};
        for (int i=0;i<a.length-1;i++){
            for (int j=0;j<a.length-j-1;j++){
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
    public void quickSortTest(){
        int[] a = new int[]{3,5,1,3,6,8};
        quickSort(a,0,a.length-1);
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }


    public void quick(int[] a,int left,int right){
        int i=left;
        int j = right;
        int tmp = a[left];
        if (left>right)
            return;
        while (i!=j){
            while (a[j]>tmp&&i<j)
                j--;
            while (a[i]<tmp&&i<j)
                i++;
            if (i<j){
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        a[left] = a[i];
        a[i] = tmp;
        quick(a,left,i-1);
        quick(a,i+1,right);
    }


    public void quickSort(int[] a,int left,int right){
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

    @Test
    public void insert(){
        int[] a = new int[]{3,5,1,3,6,8};
        insertionSort(a);
        for (int i=0;i<a.length;i++){
            System.out.printf(a[i]+" ");
        }
    }
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int t = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = t;
                j--;
            }
        }
    }

    @Test
    public void select(){

    }

    @Test
    public void shell(){
        sort(new int[]{2,8,9,1,6});
    }

    @Test
    public void merge(){

    }


    /**
     19      * 希尔排序 针对有序序列在插入时采用交换法
     20      * @param arr
     21      */
     public static void sort(int []arr){
               //增量gap，并逐步缩小增量
               for(int gap=arr.length/2;gap>0;gap/=2){
             //从第gap个元素，逐个对其所在组进行直接插入排序操作
                   for(int i=gap;i<arr.length;i++){
                               int j = i;
                              while(j-gap>=0 && arr[j]<arr[j-gap]){
                                      //插入排序采用交换法
                                  int t = arr[j];
                                  arr[j] = arr[j-gap];
                                  arr[j-gap] = t;
                                      j-=gap;
                                   }
                            }
                    }
             }

             /**
 38      * 希尔排序 针对有序序列在插入时采用移动法。
 39      * @param arr
 40      */
             public static void sort1(int []arr){
                 //增量gap，并逐步缩小增量
                 for(int gap=arr.length/2;gap>0;gap/=2){
                         //从第gap个元素，逐个对其所在组进行直接插入排序操作
                         for(int i=gap;i<arr.length;i++){
                                 int j = i;
                                 int temp = arr[j];
                                 if(arr[j]<arr[j-gap]){
                                         while(j-gap>=0 && temp<arr[j-gap]){
                                                 //移动法
                                                 arr[j] = arr[j-gap];
                                                 j-=gap;
                                             }
                                         arr[j] = temp;
                                     }
                             }
                     }
             }
}
