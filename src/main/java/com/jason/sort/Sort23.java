package com.jason.sort;

import com.jason.common.Print;
import org.junit.Test;

public class Sort23 {

    @Test
    public void bubble(){
        int[] a = new int[]{3,5,1,3,6,8};
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
}
