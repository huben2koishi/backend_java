package com.huben.c1_3.s6.p2;

public class Test01 {
    public static void main(String[] args) {
        System.out.println(getSum(5));
    }

    private static int getSum(int i) {
        if (i == 1) return 1;
        return i + getSum(i - 1);
    }
}
