package com.jason.spi;

public class People implements Say{

    @Override
    public void say(String word) {
        System.out.println("people say:"+word);
    }
}
