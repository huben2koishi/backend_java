package com.huben.c1_3.s8.p1;

import java.util.function.Predicate;

public class Demo09Predicate {
    public static void main(String[] args) {
        System.out.println(isLong("Hello World", (str) -> str.length() > 10));
        System.out.println(isLong("Hi", (str) -> str.length() > 10));

    }

    private static boolean isLong(String str, Predicate<String> predicate) {
        return predicate.test(str);
    }
}
