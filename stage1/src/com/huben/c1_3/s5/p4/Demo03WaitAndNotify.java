package com.huben.c1_3.s5.p4;

public class Demo03WaitAndNotify {
    public static void main(String[] args) {
        BaoZi bz = new BaoZi();

        new BaoZiPu(bz).start();
        new ChiHuo(bz).start();
    }
}
