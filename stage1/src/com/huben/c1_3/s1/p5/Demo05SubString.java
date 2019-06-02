package com.huben.c1_3.s1.p5;

public class Demo05SubString {
    public static void main(String[] args) {

        // public String substring(int index) 截取从 index 开始至末尾的字符串
        String str = "HelloWorld";
        System.out.println(str.substring(5));

        // public String substring(int start, int end) 截取 [start, end) 的字符串
        System.out.println(str.substring(0,5));
    }
}
