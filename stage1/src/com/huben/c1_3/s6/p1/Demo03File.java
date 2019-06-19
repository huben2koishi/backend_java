package com.huben.c1_3.s6.p1;

import java.io.File;
import java.io.IOException;

public class Demo03File {
    public static void main(String[] args) {
        File f1 = new File("stage1/src/com/huben/c1_3/s6/p1/file/test.md");
        try {
            System.out.println(f1.createNewFile()); // true
        } catch (IOException e) {
            e.printStackTrace();
        }

        File f2 = new File("stage1/src/com/huben/c1_3/s6/p1/file/2");
        System.out.println(f2.mkdir()); // true

        File f3 = new File("stage1/src/com/huben/c1_3/s6/p1/file/3/3");
        System.out.println(f3.mkdir()); // false
        System.out.println(f3.mkdirs()); // true

        System.out.println(f1.delete()); // true
        System.out.println(f2.delete()); // true
        System.out.println(f3.delete()); // true

    }
}
