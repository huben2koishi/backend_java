package com.huben.c1_3.s1.p2;

import java.util.Scanner;

public class Demo02Anonymous {
    public static void main(String[] args) {

        // 匿名对象的方式
        int num = new Scanner(System.in).nextInt();
        System.out.println("输入的数字为:" + num);

        // 使用匿名对象来传参
        methodParam(new Scanner(System.in));

        // 返回匿名对象
        Scanner s = methodReturn();

    }

    private static void methodParam(Scanner s) {
        int num = new Scanner(System.in).nextInt();
        System.out.println("输入的数字为:" + num);
    }

    private static Scanner methodReturn(){
        return new Scanner(System.in);
    }
}
