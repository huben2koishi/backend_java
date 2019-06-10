package com.huben.c1_3.s5.p6;

import java.util.Arrays;

public class Test02Array {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Mike",12),
                new Person("Lily",17),
                new Person("Jack",32),
        };
        Arrays.sort(people,(p1,p2)-> p1.getAge()-p2.getAge());
    }
}

class Person{
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
