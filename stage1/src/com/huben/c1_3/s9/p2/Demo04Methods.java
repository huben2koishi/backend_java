package com.huben.c1_3.s9.p2;

import java.lang.reflect.Method;

public class Demo04Methods {
    public static void main(String[] args) throws Exception {
        Class aClass = Class.forName("com.huben.c1_3.s9.p2.Person");

        Method eat = aClass.getMethod("eat", String.class);

        Person p = new Person("Jack", 14);

        eat.invoke(p, "fruits");
    }
}
