package com.huben.c1_3.s3.p4;

public class Demo02StringBuilderToString {
    public static void main(String[] args) {

        // String 和 StringBuilder 可以相互转换
        // String -> StringBuilder 使用 StringBuilder 的构造函数
        // StringBuilder -> String 使用 StringBuilder 是 toString() 方法

        String str = "hello";
        StringBuilder b = new StringBuilder(str);
        b.append("world").append(123);
        String str2 = b.toString();

        System.out.println(str2);

    }
}
