package com.jason.asm;

import org.objectweb.asm.ClassReader;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        ClassReader reader = new ClassReader("java.lang.Runnable");
        System.out.println(reader.getInterfaces()[0]);
        //reader.accept();
    }
}
