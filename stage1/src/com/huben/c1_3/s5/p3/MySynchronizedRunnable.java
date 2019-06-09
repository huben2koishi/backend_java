package com.huben.c1_3.s5.p3;

public class MySynchronizedRunnable  implements Runnable {
    private int ticket = 100;

    // 创建一个锁对象
    Object obj = new Object();

    @Override
    public void run() {
        while(true){
            // 创建同步代码块
            synchronized (obj){
                if(ticket > 0){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "-->" + ticket);
                    ticket--;
                }
            }
        }
    }
}
