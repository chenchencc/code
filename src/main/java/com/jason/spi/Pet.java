package com.jason.spi;

public class Pet implements Say {
    @Override
    public void say(String word) {
        System.out.println("Pet say:"+word);
    }
}
