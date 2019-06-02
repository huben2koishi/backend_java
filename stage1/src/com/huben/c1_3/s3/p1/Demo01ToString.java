package com.huben.c1_3.s3.p1;

public class Demo01ToString {
    public static void main(String[] args) {
        Person person = new Person("Mike", 17);

        // 会自动调用 toString() 方法
        System.out.println(person);
    }
}
