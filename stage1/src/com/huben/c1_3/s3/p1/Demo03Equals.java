package com.huben.c1_3.s3.p1;

public class Demo03Equals {
    public static void main(String[] args) {
        Person person1 = new Person("John",15);
        Person person2 = new Person("John",15);

        System.out.println(person1.equals(person2));
    }
}
