package com.huben.c1_3.s6.p1;

import java.io.File;

public class Demo01File {
    public static void main(String[] args) {
        System.out.println(File.pathSeparator);
        System.out.println(File.pathSeparatorChar);
        System.out.println(File.separator);
        System.out.println(File.separatorChar);

        File file = new File("com/huben/c1_3/s6/p1/file/test.txt");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.getName());
        System.out.println(file.length());
    }
}
