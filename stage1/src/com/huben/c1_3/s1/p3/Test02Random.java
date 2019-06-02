package com.huben.c1_3.s1.p3;

import java.util.Random;
import java.util.Scanner;

public class Test02Random {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(100) + 1;

        Scanner s = new Scanner(System.in);

        System.out.println("已生成一个1~100的随机整数, 请猜测是多少");

        for (int i = 9; i >-1 ; i--) {
            int n = s.nextInt();
            if (n == num) {
                System.out.println("正确! 随机数为"+num);
                break;
            } else if (n < num) {
                System.out.println("小了, 还有"+i+"次机会");
            } else{
                System.out.println("大了, 还有"+i+"次机会");
            }
        }
    }
}
