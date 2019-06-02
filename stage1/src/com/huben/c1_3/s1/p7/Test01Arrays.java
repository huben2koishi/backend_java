package com.huben.c1_3.s1.p7;

import java.util.Arrays;

public class Test01Arrays {
    public static void main(String[] args) {

        String str = "sifoihvnepihoubdcsopdjc";
        char[] chars = str.toCharArray();

        Arrays.sort(chars);
        System.out.println(chars);

        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.print(chars[i]);
        }

    }
}
