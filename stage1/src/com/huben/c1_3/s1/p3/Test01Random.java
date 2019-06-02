package com.huben.c1_3.s1.p3;

import java.util.Random;
import java.util.Scanner;

public class Test01Random {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(100) + 1;

        Scanner s = new Scanner(System.in);

        System.out.println("已生成一个1~100的随机整数, 请猜测是多少");
        while (true) {
            int n = s.nextInt();
            if (n == num) {
                System.out.println("正确! 随机数为"+num);
                break;
            } else if (n < num) {
                System.out.println("小了");
            } else{
                System.out.println("大了");
            }
        }
    }
}
