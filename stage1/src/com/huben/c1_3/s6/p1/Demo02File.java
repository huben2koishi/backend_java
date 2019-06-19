package com.huben.c1_3.s6.p1;

import java.io.File;

public class Demo02File {
    public static void main(String[] args) {
        File f1 = new File("stage1/src/com/huben/c1_3/s6/p1/file/test.txt");
        File f2 = new File("stage1/src/com/huben/c1_3/s6/p1/file/");

        System.out.println(f1.exists());
        System.out.println(f1.isFile());
        System.out.println(f2.isDirectory());
    }
}
