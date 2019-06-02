package com.huben.c1_3.s1.p5;

public class Demo02StringPool {
    public static void main(String[] args) {
        // 使用双引号创建的字符串在常量池中
        String str1 = "abc";
        String str2 = "abc";

        char[] chars = {'a','b','c'};
        String str3 = new String(chars);

        byte[] bytes = {97,98,99};
        String str4 = new String(bytes);

        System.out.println("str1 == str2 ? "+(str1==str2));
        System.out.println("str1 == str3 ? "+(str1==str3));
        System.out.println("str1 == str4 ? "+(str1==str4));
        System.out.println("str3 == str4 ? "+(str3==str4));

    }
}
