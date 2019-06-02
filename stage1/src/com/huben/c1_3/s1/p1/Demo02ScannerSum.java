package com.huben.c1_3.s1.p1;

import java.util.Scanner;

public class Demo02ScannerSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("请输入第一个数字:");
        int n1 = s.nextInt();
        System.out.println("请输入第二个数字:");
        int n2 = s.nextInt();

        System.out.println("输入的两个数字的和为: " + (n1 + n2));
    }
}
