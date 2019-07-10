package com.huben.c1_3.s9.p2;

import java.lang.reflect.Constructor;

public class Demo03Constructors {
    public static void main(String[] args) throws Exception {
        Class aClass = Class.forName("com.huben.c1_3.s9.p2.Person");

        Constructor constructor = aClass.getConstructor(String.class, int.class);
        Object mike = constructor.newInstance("Mike", 15);
        System.out.println(mike);

    }
}
