package com.huben.c1_3.s1.p8;

public class Test01Math {
    public static void main(String[] args) {
        System.out.println(counter(-10.9, 5.9));
        System.out.println(counter(-10.8, 6.5));
    }

    private static int counter(double start, double end) {
        int count = 0;
        for (int i = (int)start; i < end; i++) {
            if (Math.abs(i) > 6 || Math.abs(i) < 2.1) {
                count++;
            }
        }
        return count;
    }
}
