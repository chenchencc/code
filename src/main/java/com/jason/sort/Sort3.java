package com.jason.sort;

import com.jason.common.Print;
import org.junit.Test;
public class Sort3 {

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

    public void shell(){

    }
}
