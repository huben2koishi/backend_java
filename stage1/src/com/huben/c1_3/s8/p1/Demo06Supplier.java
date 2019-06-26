package com.huben.c1_3.s8.p1;

import java.util.function.Supplier;

public class Demo06Supplier {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        System.out.println(getString(() -> str1 + str2));
    }

    private static String getString(Supplier<String> function) {
        return function.get();
    }
}
