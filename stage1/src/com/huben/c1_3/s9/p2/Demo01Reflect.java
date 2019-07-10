package com.huben.c1_3.s9.p2;

public class Demo01Reflect {
    public static void main(String[] args) throws ClassNotFoundException {
        Class class1 = Class.forName("com.huben.c1_3.s9.p2.Person");
        System.out.println(class1);

        Class class2 = Person.class;
        System.out.println(class2);


        Person p = new Person("Mike",15);
        Class class3 = p.getClass();
        System.out.println(class3);
    }
}
