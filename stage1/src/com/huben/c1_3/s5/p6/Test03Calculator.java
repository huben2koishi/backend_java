package com.huben.c1_3.s5.p6;

public class Test03Calculator {
    public static void main(String[] args) {
        invokeCalc(120, 130, (a, b) -> a + b);
        invokeCalc(1230, 1230, (a, b) -> a + b);
    }

    private static void invokeCalc(int a, int b, Calculator calculator) {
        int result = calculator.calc(a, b);
        System.out.println("结果为: " + result);
    }
}

interface Calculator {
    int calc(int a, int b);
}