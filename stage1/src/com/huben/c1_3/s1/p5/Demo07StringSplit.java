package com.huben.c1_3.s1.p5;

public class Demo07StringSplit {
    public static void main(String[] args) {

        // public String[] split(String regex) 按照参数的规则将字符串分割
        String str = "aaa,bbb,ccc,ddd";
        String[] strings = str.split(",");

        for (String string : strings) {
            System.out.println(string);
        }

    }
}
