package com.huben.c1_3.s1.p1;

import java.util.Scanner;

public class Demo01Scanner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        System.out.println("输入的数字是: " + a);

        String str = s.next();
        System.out.println("输入的字符串是: " + str);
    }
}
