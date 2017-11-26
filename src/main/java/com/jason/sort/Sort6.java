package com.jason.sort;

import com.jason.common.Print;
import org.junit.Test;

public class Sort6 {

    int[] a = new int[]{2,9,4,3,10,6,11,2,10};

    @Test
    public void bubble(){
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length-i-1;j++){
                if (a[j+1]<a[j]){
                    int t = a[j+1];
                    a[j+1] = a[j];
                    a[j] = t;
                }
            }
        }
        Print.print(a);
    }

    @Test
    public void select(){
        for (int i=0;i<a.length;i++){
            int min = i;
            for (int j=i+1;j<a.length;j++){
                if (a[min]>a[j])
                    min = j;
            }
            int t= a[min];
            a[min] = a[i];
            a[i] = t;
        }

        Print.print(a);
    }

    @Test
    public void shell(){
        int h = 1;
        while (h<a.length/3)
            h = 3*h+1;
        while (h>=1){
            for (int i=h;i<a.length;i++){
                for (int j=i;j-h>=0&&a[j-h]>a[j];j-=h){
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
    public void insert(){
        for (int i=1;i<a.length;i++){
            int t = a[i];
            int j= i;
            while (j>0&&a[j-1]>t){
                a[j] = a[j-1];
                j--;
            }
            a[j] = t;
        }

        Print.print(a);
    }

    @Test
    public void quick(){
        quickSort(a,0,a.length-1);
        Print.print(a);
    }

    public void quickSort(int[] a,int left,int righ){
        int i = left;
        int j = righ;
        if (left>righ)
            return;
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
        quickSort(a,i+1,righ);
    }

    @Test
    public void merge(){
        merge(a,0,a.length-1);
        Print.print(a);
    }

    public void merge(int[] a,int left,int right){
        int mid = (left+right)/2;
        if (left<right){
            merge(a,left,mid);
            merge(a,mid+1,right);
            merger(a,left,mid,right);
        }
    }

    public void merger(int[] a,int left,int mid,int right){
        int[] tmp = new int[a.length];
        int j = mid+1;
        int i = left;
        int k =0;
        while (i<=mid&&j<=right){
            if (a[i]<a[j])
                tmp[k++] = a[i++];
            else
                tmp[k++] = a[j++];
        }
        while (i<=mid){
            tmp[k++] = a[i++];
        }
        while (j<=right)
            tmp[k++] = a[j++];
        for (int p=0;p<tmp.length;p++)
            a[p+left] = tmp[p];
    }
}
