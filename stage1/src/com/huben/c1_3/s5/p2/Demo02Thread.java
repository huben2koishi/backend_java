package com.huben.c1_3.s5.p2;

public class Demo02Thread {
    public static void main(String[] args) {
        // 创建线程的第二种方式: 继承 Thread 类
        MyThread mt = new MyThread();
        mt.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("main ===> " + i);
        }
    }
}
