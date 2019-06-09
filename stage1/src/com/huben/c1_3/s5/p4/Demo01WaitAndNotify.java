package com.huben.c1_3.s5.p4;

public class Demo01WaitAndNotify {
    public static void main(String[] args) {
        // 创建锁对象
        Object obj = new Object();

        new Thread() {
            @Override
            public void run() {
                // 保证 同步 和 唤醒 的代码只能有一个运行
                while (true) {
                    synchronized (obj) {
                        System.out.println("告知需要的包子种类和数量");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("顾客得到包子了---------------");
                    }
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (obj) {
                        System.out.println("告知顾客可以了");
                        obj.notify();
                    }
                }
            }
        }.start();
    }
}
