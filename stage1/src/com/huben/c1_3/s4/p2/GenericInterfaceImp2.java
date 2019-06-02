package com.huben.c1_3.s4.p2;

public class GenericInterfaceImp2<T> implements GenericInterface<T> {
    @Override
    public void method(T t) {
        System.out.println(t);
    }
}
