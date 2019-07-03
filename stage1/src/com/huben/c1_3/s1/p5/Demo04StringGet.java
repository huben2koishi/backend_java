package com.huben.c1_3.s1.p5;

public class Demo04StringGet {
    public static void main(String[] args) {

        // public int length() 返回字符串的长度
        String str1 = "komeijikoishi";
        System.out.println("字符串的长度为: " + str1.length());

        // public String concat(String str) 拼接字符串
        String str2 = "hello";
        System.out.println(str2.concat(" world"));

        // public char charAt(int index) 返回指定位置的字符
        String str3 = "Java";
        System.out.println(str3.charAt(1));

        // public int indexOf(String str) 返回要查询的字符串在原字符串第一次出现的位置
        System.out.println("Hello".indexOf("lo"));

    }
}
