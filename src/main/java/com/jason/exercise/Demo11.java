package com.jason.exercise;

import com.jason.common.Print;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 给出一个正方形，打印出它的对角
 *  1  2    3   4
 *  5  6    7   8
 *  9  10  11  12
 *  13 14  15  16
 *  则打印出： 1
 *           2 5
 *           3 6 9
 *           4 7 10 13
 *           8 11 14
 *           12 15
 *           16
 *
 将整个输出以最长的斜对角线分为两部分：右上部分和左下部分。
 右上部分：对角线的起点在第一行，列数递减，对角线上相邻元素之间横坐标和纵坐标均相差1；
 左下部分：对角线的起点在第一列上，行数递减，对角线上相邻元素之间横坐标和纵坐标均相差1；
 */
public class Demo11 {

    @Test
    public void test(){
        int[][] a = new int[][]{{1,5,9,13},{2,6,10,14},{3,7,11,15},{4,8,12,16}};
        // print(a);
        test1(a);
        System.out.println(new BigDecimal(-1561/0.2423).longValue());
    }

    public void print(int[][] a){
        for (int i=0;i<a.length;i++){
            for (int j=i;j>=0;j--){
                System.out.print(a[j][i-j]);
            }
            System.out.println();
        }



    }


    /**
     * 方式一：一个正方形a的长度为a.length,则打印完这个正方形需要2*a.length-1行
     * 当打印的行数p大于正方形的长度时，a[x][y] x=3,y=p-x再做减动作,x>=p-x,y<=x
     * @param a
     */
    public void test1(int[][] a){
        for (int i=0;i<2*a.length-1;i++){
            int m=i;
            if (i>a.length-1)
                m = 3;
            int n=i-m;
            int p = m;
            int q = n;
            for (;m>=q&&n<=p;m--,n++){
                    System.out.print(a[m][n]);
            }
            System.out.println();
        }
    }
}
