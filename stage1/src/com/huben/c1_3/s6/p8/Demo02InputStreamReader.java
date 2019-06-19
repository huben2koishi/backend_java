package com.huben.c1_3.s6.p8;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo02InputStreamReader {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr1 = new InputStreamReader(new FileInputStream("stage1/src/com/huben/c1_3/s6/p8/uft-8.txt"));
        InputStreamReader isr2 = new InputStreamReader(new FileInputStream("stage1/src/com/huben/c1_3/s6/p8/uft-8.txt"), "gbk");

        int len1 = 0;
        while ((len1 = isr1.read()) != -1) {
            System.out.print((char) len1);
        }

        System.out.println();

        int len2 = 0;
        while ((len2 = isr2.read()) != -1) {
            System.out.print((char) len2);
        }

        isr1.close();
        isr2.close();
    }
}
