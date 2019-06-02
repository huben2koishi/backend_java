package com.huben.c1_3.s1.p2;

public class Demo01Anonymous {
    public static void main(String[] args) {
        // 普通对象
        Person one = new Person("John");
        one.showName();

        // 匿名对象
        new Person("Mike").showName();
        // 当确定某个对象只会使用一次, 就可以使用匿名对象
    }
}
