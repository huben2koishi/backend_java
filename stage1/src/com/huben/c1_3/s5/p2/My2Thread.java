package com.huben.c1_3.s5.p2;

public class My2Thread extends Thread {
    @Override
    public void run() {
        System.out.println("子线程: " + this.getName());
    }

    public My2Thread() {
    }

    public My2Thread(String name) {
        super(name);
    }
}
