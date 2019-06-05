package com.huben.c1_3.s5.p2;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " ==> " + i);
        }
    }

}
