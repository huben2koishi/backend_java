package com.huben.c1_3.s3.p1;

public class Demo02Equals {
    public static void main(String[] args) {
        Person person1 = new Person("Mike", 15);
        Person person2 = new Person("Jerry", 17);

        System.out.println(person1.equals(person2));

        person1 = person2;
        System.out.println(person1.equals(person2));

        // equals() 比较的是地址值
    }
}
