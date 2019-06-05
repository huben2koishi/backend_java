package com.huben.c1_3.s5.p2;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("run ===> " + i);
        }
    }
}
