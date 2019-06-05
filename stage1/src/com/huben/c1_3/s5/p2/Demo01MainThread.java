package com.huben.c1_3.s5.p2;

public class Demo01MainThread {
    public static void main(String[] args) {
        Person p1 = new Person("Mike");

        System.out.println(0/0);

        Person p2 = new Person("Jack");

        p1.run();
        p2.run();

    }
}
