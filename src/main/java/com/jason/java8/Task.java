package com.jason.java8;

import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;

public class Task extends RecursiveAction{  //RecursiveTask

    @Override
    protected void compute() {

    }
}

class Task1 extends RecursiveTask<Integer> {

    @Override
    protected Integer compute() {
        return null;
    }
}