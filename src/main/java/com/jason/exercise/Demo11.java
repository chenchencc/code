package com.jason.exercise;

import org.junit.jupiter.api.Test;

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

    public void print(int[][] a){
        for (int i=0;i<a.length;i++){
            for (int j=i;j>=0;j--){
                System.out.print(a[j][i-j]);
            }
            System.out.println();
        }

        for (int i=a.length-1;i>0;i--){
            //for (int )
        }

    }


    @Test
    public void test(){
        int[][] a = new int[][]{{1,5,9,13},{2,6,10,14},{3,7,11,15},{4,8,12,16}};
       // print(a);
        List<Integer> li = Arrays.asList(1,5,9,13);
        Collections.fill(li,0);
        li.set(3,12);
        li.stream().forEach(System.out::println);
        double b = 13.45/2.31;
        System.out.println(b);
    }
}
