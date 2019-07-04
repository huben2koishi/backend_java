package com.huben.c1_3.s8.p3;

public class Demo03StaticMethodRef {
    private static int abs(int num, Calcable calcable){
        return calcable.calAbs(num);
    }

    public static void main(String[] args) {
//        int abs = abs(-10, num -> {
//            return Math.abs(num)
//        });
        int abs = abs(-10, Math::abs);
        System.out.println(abs);
    }
}
