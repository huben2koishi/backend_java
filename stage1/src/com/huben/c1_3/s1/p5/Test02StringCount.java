package com.huben.c1_3.s1.p5;

import java.util.Scanner;

public class Test02StringCount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str = s.next();

        int countUpper = 0;
        int countLower = 0;
        int countNumber = 0;
        int countOther = 0;

        char[] chars = str.toCharArray();

        for (char ch : chars) {
            if ('A' <= ch && ch <= 'Z') {
                countUpper++;
            } else if ('a' <= ch && ch <= 'z') {
                countLower++;
            } else if ('0' <= ch && ch <= '9'){
                countNumber++;
            } else {
                countOther++;
            }
        }

        System.out.println("大写字母: "+countUpper);
        System.out.println("小写字母: "+countLower);
        System.out.println("数字: "+countNumber);
        System.out.println("其它: "+countOther);

    }
}
