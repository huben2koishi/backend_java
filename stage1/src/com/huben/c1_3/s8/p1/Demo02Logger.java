package com.huben.c1_3.s8.p1;

public class Demo02Logger {
    public static void main(String[] args) {
        String msg1 = "Hello";
        String msg2 = "World";
        String msg3 = "Java";

        log(1, msg1 + msg2 + msg3);
        log(2, msg1 + msg2 + msg3);
    }

    private static void log(int level, String message) {
        if (level == 1) {
            System.out.println(message);
        }
    }
}
