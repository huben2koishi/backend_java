package com.huben.c1_3.s4.p2;

public class GenericInterfaceImp1 implements GenericInterface<String> {
    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
