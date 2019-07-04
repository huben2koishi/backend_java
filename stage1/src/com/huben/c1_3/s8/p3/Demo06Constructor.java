package com.huben.c1_3.s8.p3;

public class Demo06Constructor {
    public static void main(String[] args) {
        printName("赵", Person::new);
    }

    private static void printName(String name, PersonBuilder builder) {
        Person person = builder.buildPerson(name);
        System.out.println(person.getName());
    }
}
