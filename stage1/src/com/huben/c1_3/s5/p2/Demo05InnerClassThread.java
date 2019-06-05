package com.huben.c1_3.s5.p2;

public class Demo05InnerClassThread {
    public static void main(String[] args) {
        // 创建线程的第三种方式:  匿名内部类
        new Thread() {
            @Override
            public void run() {
                System.out.println("内部类继承 Thread");
            }
        }.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("内部类实现 Runnable");
            }
        }).start();

    }
}
