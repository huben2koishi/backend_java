package com.huben.c1_3.s1.p4;

public class Demo01Array {
    public static void main(String[] args) {
        Person[] array = new Person[3];

        Person one = new Person("Mike", 18);
        Person two = new Person("John", 23);
        Person three = new Person("Jack", 11);

        array[0] = one;
        array[1] = two;
        array[2] = three;

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        System.out.println(array[0].getName());
        // 数组的缺点, 一旦创建, 大小不可更改
    }
}
