package com.huben.c1_3.s1.p6;

class Person{
    static {
        System.out.println("静态代码块执行");
    }

    Person(){
        System.out.println("构造方法执行");
    }
}
