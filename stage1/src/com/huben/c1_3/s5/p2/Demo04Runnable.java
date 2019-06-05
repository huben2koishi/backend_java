package com.huben.c1_3.s5.p2;

public class Demo04Runnable {
    public static void main(String[] args) {
        // 创建线程的第二种方式: 实现 Runnable 接口
        new Thread(new MyRunnable()).start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " ==> " + i);
        }
    }
}
