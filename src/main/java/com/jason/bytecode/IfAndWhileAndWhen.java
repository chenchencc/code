package com.jason.bytecode;

public class IfAndWhileAndWhen {

    public void test(){
        int i = 0;
        for (int m = 0;m < 100;m++){
            if (m < 5){
                i = m;
            }
        }
    }

    public void test2(){
        int i = 0;
        while (i<10){
            System.out.println(i);
            i++;
        }
    }

    IfAndWhileAndWhen(){
        super();
    }
}
