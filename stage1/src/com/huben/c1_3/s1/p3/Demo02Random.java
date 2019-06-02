package com.huben.c1_3.s1.p3;

import java.util.Random;

public class Demo02Random {
    public static void main(String[] args) {
        Random r = new Random();

        for (int i = 0; i < 100; i++) {
            // 随机 int 数字, 参数表示范围 (左闭右开区间)
            int num = r.nextInt(6);
            System.out.println(num);
        }
    }
}
