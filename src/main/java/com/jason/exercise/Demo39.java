package com.jason.exercise;

import org.junit.Test;

public class Demo39 {

    /**
     * 请实现一个函数，把字符串中的每个空格替换成"%20"，例如“We are happy.”，则输出“We%20are%20happy.”
     */
    public void replace(String st){
        char[] chars = st.toCharArray();
        int count=0;
        for (int i=0;i<chars.length;i++){
            if ((int)chars[i]==32)
                count++;
        }
        char[] c = new char[chars.length+count*2];
        int index = 0;
        for (int i=0;i<chars.length;i++){
            if ((int)chars[i] == 32){
                c[index++] = '%';
                c[index++] = '2';
                c[index++] = '0';
            }else
                c[index++] = chars[i];
        }
        System.out.println(String.valueOf(c));
    }

    @Test
    public void test(){
        replace("we  are happy");
    }
}
