package com.jason.lock;

import org.junit.Test;

import java.util.concurrent.locks.ReentrantLock;

public class ThreadTest {

    @Test
    public void test(){
       Lock lock = new Lock();



       new Thread(()->{
           try {
               lock.one();
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }).start();
       new Thread(()->{
           try {
               lock.two();
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }).start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


class Lock{
    volatile static java.util.concurrent.locks.Lock lock = new ReentrantLock();

    public void one() throws InterruptedException {
        try {
            lock.lock();
            for (int i=0;i<2000;i++){
                System.out.println("----------------"+i+"------------"+Thread.currentThread().getName());
            }
        }catch (Exception e){

        }finally {
            lock.unlock();
        }
    }

    public void two() throws InterruptedException {
        try {
            lock.lock();
            for (int i=0;i<2000;i++){
                System.out.println("+++++++++++++++"+i+"+++++++++++++++"+Thread.currentThread().getName());
            }
        }catch (Exception e){

        }finally {
            lock.unlock();
        }
    }
}
