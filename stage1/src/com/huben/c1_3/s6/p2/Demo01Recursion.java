package com.huben.c1_3.s6.p2;

public class Demo01Recursion {
    public static void main(String[] args) {
        System.out.println(jiecheng(5));
    }

    private static int jiecheng(int i) {
        if (i==1) return i;
        return i*jiecheng(i-1);
    }
}
