package com.huben.c1_3.s1.p1;

import java.util.Scanner;

public class Demo03ScannerMax {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("请输入第一个数字:");
        int n1 = s.nextInt();
        System.out.println("请输入第二个数字:");
        int n2 = s.nextInt();
        System.out.println("请输入第三个数字:");
        int n3 = s.nextInt();

        int temp = n1 > n2 ? n1 : n2;
        int result = temp > n3 ? temp : n3;

        System.out.println("最大的值为: " + result
        );
    }
}
