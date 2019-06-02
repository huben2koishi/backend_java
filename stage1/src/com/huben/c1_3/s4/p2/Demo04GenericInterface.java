package com.huben.c1_3.s4.p2;

public class Demo04GenericInterface {
    public static void main(String[] args) {
        GenericInterfaceImp1 gi1 = new GenericInterfaceImp1();
        gi1.method("hello");

        GenericInterfaceImp2<String> gi2 = new GenericInterfaceImp2<>();
        gi2.method("world");
    }
}
