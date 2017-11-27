package com.jason.sort;

import com.jason.common.Array;
import com.jason.common.Print;
import org.junit.Test;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class Sort7 {

    public void bubble(int[] b){
        for (int i=0;i< b.length;i++){
            for (int j=0;j<b.length-i-1;j++){
                if (b[j]>b[j+1]){
                    int t = b[j];
                    b[j] = b[j+1];
                    b[j+1] = t;
                }
            }
        }
        Print.print(b);
    }


    public void select(int[] a){
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

    public void insert(int[] a){
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

    public void shell(int[] a){
        int h = 1;
        while (h<a.length/3)
             h = 3*h+1;
        while (h>=1){
            for (int i=h;i<a.length;i++){
                for (int j=i;j-h>=0&&a[j-h]>a[j];j-=h){
                    int t = a[j];
                    a[j] = a[j-h];
                    a[j-h] = t;
                }
            }
            h = h/3;
        }
        Print.print(a);
    }
    public void quick(){
        quickSort(Array.b,0,Array.b.length-1);
        Print.print(Array.b);
    }

    public void quickSort(int[] a,int left,int right){
        if (left>right)
            return;
        int i =left,j = right,t = a[left];
        while (i!=j){
            while (i<j&&a[j]>=t){
                j--;
            }
            while (i<j&&a[i]<=t)
                i++;
            if (i<j){
                int tmp = a[i];
                a[i] = tmp;
                tmp = a[j];
            }
        }
        a[left] = a[i];
        a[i] = t;
        quickSort(a,left,i-1);
        quickSort(a,i+1,right);
    }

    public void quickSort1(int[] a,int left,int right){
        if (left>right)
            return;
        int i = left,j = right,t = a[left];
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
    @Test
    public void test(){
        /*bubble(Array.b);
        System.out.println();
        select(Array.b);
        System.out.println();
        insert(Array.b);
        System.out.println();
        shell(Array.b);
        System.out.println();
        quick();*/
        merge(Array.b,0,Array.b.length-1);
        Print.print(Array.b);
    }
    public void merge(int[] a,int left,int right){
        if (left>=right)
            return;
        int mid = (left+right)>>1;
        merge(a,left,mid);
        merge(a,mid+1,right);
        mergerSort(a,left,mid,right);
    }

    public void mergerSort(int[] a,int left,int mid,int right){
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
        while (i<=mid){
            tmp[k++] = a[i++];
        }
        while (j<=right){
            tmp[k++] = a[j++];
        }
        for (int p=0;p<tmp.length;p++){
            a[p+left] = tmp[p];
        }
    }

    public void mergeSort(int[] a,int left,int mid,int right){
        int[] temp = new int[right - left + 1];
        int i = left;// 左指针
        int j = mid + 1;// 右指针
        int k = 0;

        // 把较小的数先移到新数组中
        while (i <= mid && j <= right) {
            if (a[i] < a[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }

        // 把左边剩余的数移入数组
        while (i <= mid) {
            temp[k++] = a[i++];
        }

        // 把右边边剩余的数移入数组
        while (j <= right) {
            temp[k++] = a[j++];
        }

        // 把新数组中的数覆盖nums数组
        for (int k2 = 0; k2 < temp.length; k2++) {
            a[k2 + left] = temp[k2];
        }

    }

    public static void sort(int[] a, int left, int right) {
        if (left >= right)
            return;

        int center = (left + right) >> 1;
        sort(a, left, center);
        sort(a, center + 1, right);
        merge(a, left, center, right);
    }

    public static void merge(int[] data, int left, int center, int right) {
        int[] tmpArr = new int[right+1];
        int mid = center + 1;
        int index = left; // index记录临时数组的索引
        int tmp = left;

        // 从两个数组中取出最小的放入中临时数组
        while (left <= center && mid <= right) {
            tmpArr[index++] = (data[left] <= data[mid]) ? data[left++]: data[mid++];
        }
        // 剩余部分依次放入临时数组
        while (mid <= right) {
            tmpArr[index++] = data[mid++];
        }
        while (left <= center) {
            tmpArr[index++] = data[left++];
        }
        // 将临时数组中的内容复制回原数组
        for (int i = tmp; i <= right; i++) {
            data[i] = tmpArr[i];
        }
        System.out.println(Arrays.toString(data));
    }

}
