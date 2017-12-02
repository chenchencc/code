package com.jason.exercise;

import org.junit.Test;

public class Demo38 {

    /**
     * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
     * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
     * @param a
     * 1  2   3   4
     * 5  6   8    9
     * 10  12  13  20
     * 14  15  17  21
     * a[i].length每列的长度
     * a.length该数组多少行
     */
    public boolean search(int[][] a,int k){
        int u = a.length-1;
        int x = u,y = 0;
        while (x>=0&&y<a.length){
            if(a[x][y]>k){
                x--;
            }else if (a[x][y]<k){
                y++;
            }else {
                System.out.println(x+","+y);
                return true;
            }
        }
        return false;

    }
    @Test
    public void test(){
        int[][] a = new int[][]{{1,5,9,13},{2,6,10,14},{3,7,11,15},{4,8,12,16}};
        search(a,7);
    }

    public static boolean find(int[][] matrix, int number) {
        // 输入条件判断
        if (matrix == null || matrix.length < 1 || matrix[0].length < 1) {
            return false;
        }
        int rows = matrix.length; // 数组的行数
        int cols = matrix[1].length; // 数组行的列数
        int row = 0; // 起始开始的行号
        int col = cols - 1; // 起始开始的列号
        // 要查找的位置确保在数组之内
        while (row >= 0 && row < rows && col >= 0 && col < cols) {
            if (matrix[row][col] == number) { // 如果找到了就直接退出
                return true;
            } else if (matrix[row][col] > number) { // 如果找到的数比要找的数大，说明要找的数在当前数的左边
                col--; // 列数减一，代表向左移动
            } else { // 如果找到的数比要找的数小，说明要找的数在当前数的下边
                row++; // 行数加一，代表向下移动
            }
        }
        return false;
    }
}
