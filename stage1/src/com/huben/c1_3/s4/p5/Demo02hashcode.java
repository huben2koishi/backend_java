package com.huben.c1_3.s4.p5;

public class Demo02hashcode {
    public static void main(String[] args) {
        Person person = new Person();
        int hashcode = person.hashCode();
        System.out.println(hashcode);
    }
}
