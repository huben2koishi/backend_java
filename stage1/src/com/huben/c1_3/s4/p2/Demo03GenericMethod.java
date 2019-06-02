package com.huben.c1_3.s4.p2;

public class Demo03GenericMethod {
    public static void main(String[] args) {
        GenericMethod gm = new GenericMethod();
        gm.method1("hello");

        GenericMethod.method2("world");
    }
}
