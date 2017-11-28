package com.jason.exercise;

/**
 * 单词反转
 */
public class Demo7 {

    /**
     * 逐一往后移的思路
     * @param word
     * @return
     */
    public String rerveseWord1(String word){
        if (word==null||"".equals(word))
            return word;
        int length = word.length();
        return word;
    }

    /**
     * 首位元素互换,然后依次做i++,j--操作直到i<=j
     * @param word
     */
    public String reverseWord2(String word){
        if (word==null||"".equals(word))
            return word;
        int length = word.length();
        int i=0,j=length-1;
        while (i<=j){
            char c_i = word.charAt(i);
            char c_j = word.charAt(j);
        }
        return word;
    }
}
