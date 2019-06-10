package com.huben.c1_3.s5.p6;

public class Demo01Lambda {
    public static void main(String[] args) {
        // 开启新线程的步骤
        MyRunnable myRun = new MyRunnable();
        Thread t = new Thread(myRun);
        t.start();

        // 简化写法
        Runnable run = new Runnable(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "创建了一个新的线程");
            }
        };
        new Thread(run).start();


        // 继续简化写法
        new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "创建了一个新的线程");
            }
        }).start();
    }
}
