package com.huben.c1_3.s4.p2;

public class Demo02GenericClass {
    public static void main(String[] args) {
        GenericClass<String > gc = new GenericClass<>();
        gc.setName("hello");

        System.out.println(gc.getName());
    }
}
