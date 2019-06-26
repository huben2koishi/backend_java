package com.huben.c1_3.s8.p1;

public class Demo04LambdaThread {
    public static void main(String[] args) {
        startThread(() -> System.out.println(Thread.currentThread().getName() + "线程任务执行"));
    }

    private static void startThread(Runnable task) {
        new Thread(task).start();
    }
}
