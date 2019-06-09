package com.huben.c1_3.s5.p3;

public class Demo01ThreadSafe {
    public static void main(String[] args) {
        MyRunnable run = new MyRunnable();

        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);

        t0.start();
        t1.start();
        t2.start();
    }
}
