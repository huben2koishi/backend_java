package com.huben.c1_3.s4.p5;

import java.util.HashSet;

public class Demo04HashSetSave {
    public static void main(String[] args) {
        HashSet<Person> people = new HashSet<>();
        Person p1 = new Person("Harry",15);
        Person p2 = new Person("Harry",15);
        Person p3 = new Person("Harry",18);

        people.add(p1);
        people.add(p2);
        people.add(p3);
        System.out.println(people);
    }
}
