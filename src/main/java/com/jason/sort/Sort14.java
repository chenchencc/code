package com.jason.sort;

import com.jason.common.Print;
import org.junit.Test;

public class Sort14 {

    @Test
    public void bubble(){
        int[] a = {4,8,9,0,1,3,2,5,12,10,7,5};
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
    public void select(){
        int[] a = {4,8,9,0,1,3,2,5,12,10,7,5};
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
    public void insert(){
        int[] a = {4,8,9,0,1,3,2,5,12,10,7,5};
        for (int i=1;i<a.length;i++){
            int t = a[i];
            int j = i;
            for (;j-1>=0&&a[j-1]>=t;j--){
                a[j] = a[j-1];
            }
            a[j] = t;
        }
        Print.print(a);
    }

    @Test
    public void shell(){
        int[] a = {4,8,9,0,1,3,2,5,12,10,7,5};
        int h = 1;
        while (h<a.length/3)
            h = 3*h+1;
        while (h>=1){
            for (int i=h;i<a.length;i++){
                for (int j=i;j-h>=0&&a[j]<a[j-h];j-=h){
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
    public void quick(){
        int[] a = {4,8,9,0,1,3,2,5,12,10,7,5};
        quick(a,0,a.length-1);
        Print.print(a);
    }

    public void quick(int[] a,int left,int right){
        if (left>=right)
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
                int f = a[i];
                a[i] = a[j];
                a[j] = f;
            }
        }
        a[left] = a[i];
        a[i] = t;
        quick(a,left,i-1);
        quick(a,i+1,right);
    }


    @Test
    public void merge(){
        int[] a = {4,8,9,0,1,3,2,5,12,10,7,5};
        merge(a,0,a.length-1);
        Print.print(a);
    }

    public void merge(int[] a,int left,int right){
        if (left>=right)
            return;
        int mid = (left+right)>>1;
        merge(a,left,mid);
        merge(a,mid+1,right);
        merge(a,left,mid,right);
    }

    public void merge(int[] a,int left,int mid,int right){
        if (left>=right)
            return;
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

}
