package com.huben.c1_3.s9.p2;

import java.lang.reflect.Field;

public class Demo02Fields {
    public static void main(String[] args) throws Exception {
        Class aClass = Class.forName("com.huben.c1_3.s9.p2.Person");

        Field[] fields = aClass.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());

        }

        Person p = new Person();

        Field id = aClass.getField("id");
        System.out.println(p);

        Object o = id.get(p);
        System.out.println(o);

        id.set(p, 1);
        System.out.println(p);

        Field name = aClass.getDeclaredField("name");
        name.setAccessible(true);

        Object o2 = name.get(p);
        System.out.println(o2);

        name.set(p,"Mike");
        System.out.println(p);


    }
}
