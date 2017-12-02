package com.jason.exercise;

import com.jason.common.Array;
import com.jason.common.Print;
import org.junit.Test;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Demo33 {

    /**
     * 输入一个数组，实现一个函数，让所有奇数都在偶数前面
     * 思路一：用两个临时数组来分别装奇数和偶数，
     * 思路二：逐一往后移动，奇数往前移动
     * 思路三：用两个指针分别指向数组的头和尾
     */
    public void sort(int[] a){
        int head = 0;
        int tail = a.length-1;
        while (head!=tail){
            if (a[head]%2==0&&a[tail]%2!=0){
                int t = a[head];
                a[head] = a[tail];
                a[tail] = t;
            }else if (a[head]%2!=0&&a[tail]%2!=0){
                head++;
            }else if (a[head]%2==0&&a[tail]%2==0){
                tail--;
            }else {
                tail--;
                head++;
            }

        }
    }

    public void change(int[] a){
        int head = 0;
        int tail = a.length-1;
        while (head!=tail){
            while (head<tail&&a[tail]%2==0){
                tail--;
            }
            while (head<tail&&a[head]%2!=0)
                head++;
            int t = a[head];
            a[head] = a[tail];
            a[tail] = t;
        }
    }

    @Test
    public void test(){
        int[] a = {4,8,9,0,1,3,2,5,12,10,7,5};
//        sort(a);
        change(a);
        Print.print(a);
    }







































}
