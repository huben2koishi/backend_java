package com.huben.c1_3.s1.p5;

public class Demo03StringEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        char[] chars = {'H','e','l','l','o'};
        String  str3 = new String(chars);

        // public boolean equals(Object obj) 比较内容
        System.out.println(str1.equals(str2));    // true
        System.out.println(str1.equals(str3));    // true
        System.out.println(str1.equals("hello")); // false
        System.out.println("Hello".equals(str3)); // false

        // public boolean equalsIgnoreCase(String str) 忽略大小写的比较
        System.out.println("hello".equalsIgnoreCase(str1)); // true
    }
}
