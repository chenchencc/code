package com.jason.sort;

import org.junit.Test;
public class Bucket {

    /**
     * 桶排序
     * 问题：
     * 现在分别有 5 个人的名字和分数: huhu 5 分、 haha 3 分、 xixi 5 分、 hengheng 2 分和 gaoshou
     8 分。请按照分数从高到低,输出他们的名字。即应该输出 gaoshou、 huhu、 xixi、 haha、 hengheng。
     发现问题了没有?如果使用我们刚才简化版的桶排序算法仅仅是把分数进行了排序。最终输
     出的也仅仅是分数,但没有对人本身进行排序。
     */
    @Test
    public void test(){
        int[] a = new int[]{10,3,6,8,3,5};
        int[] b = new int[11];
        for (int i=0;i<a.length;i++){
            b[a[i]]++;
        }
        for (int i=0;i<b.length;i++){
            if (b[i]>0){
                for (int j=b[i];j>0;j--){
                    System.out.printf(i+" ");
                }
            }
        }
    }

}
