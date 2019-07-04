package com.huben.c1_3.s8.p3;

public class Demo01Printable {
    public static void main(String[] args) {
//        sayHello(s -> System.out.println(s));
        sayHello(System.out::println);
    }

    private static void sayHello(Printable p) {
        p.print("Hello");
    }
}
