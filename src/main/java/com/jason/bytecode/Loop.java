package com.jason.bytecode;

public class Loop {
    public static void main(String[] args) {

    }

    public void loop(){
        for (int i=0;i<100;i++){
            System.out.println(i);
        }
    }

    public void while1(){
        int i = 0;
        while (i <= 10){
            System.out.println(i);
            i++;
        }
    }
}