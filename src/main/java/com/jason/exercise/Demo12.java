package com.jason.exercise;

import com.jason.common.Array;
import org.junit.Test;

/**
 * 打印一个正方形的之字行
 *  1   2    3    4
 *  5   6    7    8
 *  9   10   11   12
 *  13  14   15   16
 *  之字行：
 *  1
 *  2 5
 *  9 6 3
 *  4 7 10 13
 *  14 11 8
 *  12 15
 *  16
 */
public class Demo12 {

    /**
     * 思路：与大于正方形对角线的思路一样，只是在打印时遇到行数是偶数行时x,y值互换
     *
     */
    public void test(int[][] a){
        for (int i=0;i<2*a.length-1;i++){
            int m = i;
            if (i>a.length-1){
                m = 3;
            }
            int n = i-m;
            //偶数行 将 x y 坐标互换
           /* if (i%2==0){
                int t = m;
                m = n;
                n = t;
            }*/
            //标记 m n 的初始值
            int m_init = m;
            int n_init = n;

            while (m>=n_init&&n<=m_init){
                if (m>=0||n>=0){
                    if (i%2==0)
                        System.out.print(a[n][m]);
                    else
                        System.out.print(a[m][n]);
                }
                m--;
                n++;
            }
            System.out.println();
        }
    }

    @Test
    public void test(){
        test(Array.a);
    }
}
