package com.huben.c1_3.s4.p2;

public class GenericMethod {
    public <T> void method1(T t) {
        System.out.println(t);
    }

    public static <T> void method2(T t) {
        System.out.println(t);
    }
}
