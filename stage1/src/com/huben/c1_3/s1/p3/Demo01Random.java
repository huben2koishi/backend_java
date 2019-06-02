package com.huben.c1_3.s1.p3;

import java.util.Random;

public class Demo01Random {
    public static void main(String[] args) {
        Random r = new Random();
        // 随机的 int 数字
        int num = r.nextInt();
        System.out.println("随机数为: " + num);
    }
}
