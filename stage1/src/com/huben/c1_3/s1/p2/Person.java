package com.huben.c1_3.s1.p2;

class Person {
    private String name;

    void showName() {
        System.out.println("我是: " + this.name);
    }

    Person(String name) {
        this.name = name;
    }
}
