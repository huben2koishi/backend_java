package com.huben.c1_3.s1.p6;

public class Demo02StaticMethod {
    public static void main(String[] args) {
        // 普通方法要通过类的实例调用
        MyClass myClass = new MyClass();
        myClass.method();

        // 静态方法通过类本身调用
        MyClass.methodStatic();

        // 静态方法只能访问静态变量
        // 静态方法中不能使用 this
    }
}
