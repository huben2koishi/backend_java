package com.huben.c1_3.s1.p5;

public class Demo01String {
    public static void main(String[] args) {
        // 字符串为常量, 不可改变
        // 字符串效果相当于 char[]字符数组, 但底层原理是 byte[]字节数组

        // 创建字符串的常见 3+1 中方法

        // public String() 创建一个空白字符串
        String str1 = new String();
        System.out.println("第一个字符串: "+str1);

        // public String(char[] arr) 根据字符数组创建对应字符串
        char[] chars = {'A','B','C','D'};
        String str2 = new String(chars);
        System.out.println("第二个字符串: "+str2);

        // public String(byte[] arr) 根据字符数组创建对应字符串
        byte[] bytes = {97,98,99,100};
        String str3 = new String(bytes);
        System.out.println("第二个字符串: "+str3);

        // 直接用双引号创建
        String str4 = "hello";
        System.out.println(str4);

    }
}
