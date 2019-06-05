package com.huben.c1_3.s5.p2;

public class Demo03ThreadMethod {
    public static void main(String[] args) {
        // 获取线程名称
        //   1. 线程对象调用方法 getName()
        //   2. 调用静态方法 Thread.currentThread()
        My2Thread mt = new My2Thread();
        mt.start();

        System.out.println("主线程: " + Thread.currentThread().getName());

        // 设置线程名称
        //   1. 线程对象调用方法 setName()
        //   2. 创建线程时使用重载构造方法 new Thread(name)
        new My2Thread("myThread").start();

        // public static void sleep(long milliseconds) 线程暂停指定毫秒

    }
}
