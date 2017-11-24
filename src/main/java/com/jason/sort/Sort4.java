package com.jason.sort;

import com.jason.common.Print;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class Sort4 {

    /**
     * bub
     */
    @Test
    public void bubble(){
        int[] a = new int[]{2,68,4,2,8,74};
        for (int i=0;i<a.length-1;i++){
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
    public void select(){
        int[] a = new int[]{2,68,4,2,8,74};
        for (int i=0;i<a.length;i++){
            int min = i;
            for (int j=i+1;j<a.length;j++){
                if (a[min]>a[j])
                    min = j;
            }
            int t = a[min];
            a[min] = a[i];
            a[i] = t;
        }
        Print.print(a);
    }

    /**
     * 插入排序的思路是：将无序的向有序的一边移动，逐一排序插入
     */
    @Test
    public void insert(){
        int[] a = new int[]{2,68,4,2,8,74};
        for (int i=1;i<a.length;i++){
            int t = a[i];
            int j = i;
            for (;j>0&&a[j-1]>t;j--){
                a[j] = a[j-1];
            }
            a[j] = t;
        }
        Print.print(a);
    }

    @Test
    public void shell(){
        int[] a = new int[]{2,68,4,21,4,89,100,8,74,1};
        int h=1;
        while (h<a.length/3)
            h = 3*h+1;
        while (h>=1){
            for (int i=h;i<a.length;i++){
                for (int j=i;j>=h&&a[j]>a[j-h];j-=h){
                    int t = a[j];
                    a[j] = a[j-h];
                    a[j-h] = t;
                }
            }
            h = h/3;
        }
        Print.print(a);
    }


    @Test
    public void select1(){
        int[] a = new int[]{2,68,4,2,8,74};
        for (int i=0;i<a.length;i++){
            int min = i;
            for (int j=i+1;j<a.length;j++){
                if (a[min]>a[j])
                    min = j;
            }
            int t = a[min];
            a[min] = a[i];
            a[i] = t;
        }
        Print.print(a);
    }

    @Test
    public void insert1(){
        int[] a = new int[]{2,68,4,2,8,74};
        for (int i=1;i<a.length;i++){
            int t = a[i];
            int j=i;
            for (;j>0&&a[j-1]>t;j--){
                a[j] = a[j-1];
            }
            a[j] = t;
        }
        Print.print(a);
    }


    @Test
    public void insert2(){
        int[] a = new int[]{2,68,4,21,4,89,100,8,74};
        for (int i=1;i<a.length;i++){
            int t =a[i];
            int j=i;
            while (j>0&&a[j-1]>t){
                a[j] = a[j-1];
                j--;
            }
            a[j] = t;
        }
        Print.print(a);
    }

    @Test
    public void bubble1(){
        int[] a = new int[]{2,68,4,21,4,89,100,8,74};
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length-i-1;j++){
                if (a[j]>a[j+1]){
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] =t;
                }
            }
        }
        Print.print(a);
    }

    @Test
    public void quik(){
        int[] a = new int[]{2,68,4,21,4,89,100,8,74};
        quicksort(a,0,a.length-1);
        Print.print(a);
    }

    private void quicksort(int[] a,int left,int right){
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
    public void merge(){
        int[] a = new int[]{2,68,4,21,4,89,100,8,74};
        sort1(a,0,a.length-1);
        Print.print(a);
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

    public void sort1(int[] a,int left,int right){
        int mid = (left+right)/2;
        if (left<right){
            sort1(a,left,mid);
            sort1(a,mid+1,right);
            merge1(a,left,mid,right);
        }
    }

    public void merge1(int[] a,int left,int mid,int right){
        int[] tmp = new int[right-left+1];
        int i = left;
        int j = mid+1;
        int k = 0;
        while (i<=mid&&j<=right){
            if (a[i]<a[j])
                tmp[k++] = a[i++];
            else
                tmp[k++] = a[j++];
        }
        while (i<=mid)
            tmp[k++] = a[i++];
        while (j<=right)
            tmp[k++] = a[j++];
        for (int p=0;p<tmp.length;p++){
            a[p+left] = tmp[p];
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
    @Test
    public void test(){
        int a = 10;
        int b = 5;
        test1(a,b);
        System.out.println("a="+a+",b="+b);
        String s = "Jason";
        changeSt(s);
        System.out.println(s);
    }

    public void test1(int a,int b){
        a=a+1;
        b=b+1;
    }


    public void changeSt(String s){
        s = "-----"+s;
    }

    @Test
    public void bubble2(){
        int[] a = new int[]{2,68,4,21,4,89,100,8,74};
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
    public void select2(){
        int[] a = new int[]{2,68,4,21,4,89,100,8,74};
        for (int i=0;i<a.length;i++){
            int min = i;
            for (int j=i+1;j<a.length;j++){
                if (a[min]>a[j])
                    min = j;
            }
            int t = a[min];
            a[min] = a[i];
            a[i] = t;
        }
        Print.print(a);
    }

    @Test
    public void insert3(){
        int[] a = new int[]{2,68,4,21,4,89,100,8,74};
        for (int i=1;i<a.length;i++){
            int t = a[i];
            int j = i;
            while (j>0&&a[j-1]>t){
                a[j] = a[j-1];
                j--;
            }
            a[j] = t;
        }
        Print.print(a);
    }

    @Test
    public void shell1(){
        int[] a = new int[]{2,68,4,21,4,89,100,8,74};
        int h = 1;
        while (h<a.length/3)
            h = 3*h+1;
        while (h>=1){
            for (int i=h;i<a.length;i++){
                for (int j=i;j>=h&&a[j]>a[j-h];j-=h){
                    int t = a[j-h];
                    a[j-h] = a[j];
                    a[j] = t;
                }
            }
            h = h/3;
        }
        Print.print(a);
    }


    @Test
    public void tt(){
       /* BigDecimal durationDecimal = new BigDecimal(151521);
        BigDecimal customFlowDeciaml = new BigDecimal(1515);
        long avgDuration = durationDecimal.divide(customFlowDeciaml,2).divide(new BigDecimal(60)).longValue();*/

       long l = 41568;
       long a = 13;
       long b = l/(23*a);
        System.out.println(b);
    }


    static int[] a = new int[]{2,68,4,21,4,89,100,8,74};

    @Test
    public void bubble4(){
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length-i-1;j++){
                if (a[j]>a[j+1]){
                    int t =a[j];
                    a[j]=a[j+1];
                    a[j+1] = t;
                }
            }
        }
        Print.print(a);
    }


    @Test
    public void insert4(){
        for (int i=1;i<a.length;i++){
            int t = a[i];
            int j = i;
            while (j>0&&a[j-1]>t){
                a[j] = a[j-1];
                j--;
            }
            a[j] = t;
        }

        Print.print(a);
    }

    @Test
    public void select4(){
        for (int i=0;i<a.length;i++){
            int min = i;
            for (int j=i+1;j<a.length;j++){
                if (a[min]>a[j])
                    min = j;
            }
            int t = a[min];
            a[min] = a[i];
            a[i] = t;
        }
        Print.print(a);
    }

    @Test
    public void shell4(){
        int h =1;
        while (h<a.length/3)
            h = 3*h+1;
        while (h>=1){

            for (int i=h;i<a.length;i++){
                for (int j=i;j-h>=0&&a[j]>a[j-h];j-=h){
                    int t = a[j-h];
                    a[j-h] = a[j];
                    a[j] = t;
                }
            }
            h= h/3;
        }
        Print.print(a);
    }

    public void quuick4(){

    }

    public void quickSort(int[] a,int left,int right){
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

    public void quickSort4(int[] a,int left,int right){
        int i,j,temp;
        if (left>right)
            return;
        temp = a[left];
        i = left;
        j = right;
        while (i!=j){
            while (i<j&&a[j]>temp){
                j--;
            }
            while (i<j&&a[i]<temp)
                i++;
            if (i<j){
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        a[left] = a[i];
        a[i] = temp;
        quickSort4(a,left,i-1);
        quickSort4(a,i+1,right);
    }

    @Test
    public void quick5(){
        quickSort5(a,0,a.length-1);
        Print.print(a);
    }

    public void quickSort5(int[] a,int left,int right){
        if (left>right)
            return;
        int tmp = a[left];
        int i,j;
        i = left;
        j = right;
        while (i!=j){
            while (i<j&&a[j]>=tmp)
                j--;
            while (i<j&&a[i]<=tmp)
                i++;
            if (i<j){
                int t = a[i];
                a[i] =a[j];
                a[j] = t;
            }
        }
        a[left] = a[i];
        a[i] = tmp;
        quickSort5(a,left,i-1);
        quickSort5(a,i+1,right);
    }

    @Test
    public void quick6(){
        quickSort6(a,0,a.length-1);
        Print.print(a);
    }

    public void quickSort6(int[] a,int left,int right){
        if (left>right)
            return;
        int tmp = a[left];
        int i = left;
        int j = right;
        while (i!=j){
            while (i<j&&a[j]>=tmp)
                j--;
            while (i<j&&a[i]<=tmp)
                i++;
            if (i<j){
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        a[left] = a[i];
        a[i] = tmp;
        quickSort6(a,left,i-1);
        quickSort6(a,i+1,right);

    }



    @Test
    public void quick7(){
        quickSort7(a,0,a.length-1);
        Print.print(a);
    }


    public void quickSort7(int[] a,int left,int right){
        if (left>right)
            return;
        int i=left,j=right;
        int tmp = a[left];
        while (i!=j){
            while (i<j&&a[j]>=tmp)
                j--;
            while (i<j&&a[i]<=tmp)
                i++;
            if (i<j){
                int t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }
        a[left] = a[i];
        a[i] = tmp;
        quickSort7(a,left,i-1);
        quickSort7(a,i+1,right);
    }

}
