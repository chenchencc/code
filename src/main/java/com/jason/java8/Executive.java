package com.jason.java8;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class Executive {
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
        ForkJoinTask task = pool.submit(()->{
            System.out.println("aaa");
        });

    }
}
