package com.huben.c1_3.s4.p5;

public class Demo06VarArgs {
    public static void main(String[] args) {
        System.out.println(add(10));
        System.out.println(add(10, 20));
        System.out.println(add(10, 20, 30, 40));
    }

    public static int add(int... arr) {
        int result = 0;
        for (int i : arr) {
            result += i;
        }
        return result;
    }
}
