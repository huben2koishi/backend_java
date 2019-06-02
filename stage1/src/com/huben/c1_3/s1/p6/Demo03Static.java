package com.huben.c1_3.s1.p6;

public class Demo03Static {
    public static void main(String[] args) {
        // 静态代码块只会在类第一次被用到时执行1次
        Person person1 = new Person();
        Person person2 = new Person();
    }
}

