package com.huben.c1_3.s5.p6;

public class Demo02Lambda {
    public static void main(String[] args) {
        new Thread(() -> System.out.println(Thread.currentThread().getName() + "创建了一个新的线程")).start();
    }
}
