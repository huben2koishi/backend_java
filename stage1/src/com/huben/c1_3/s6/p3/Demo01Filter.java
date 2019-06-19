package com.huben.c1_3.s6.p3;

import java.io.File;

public class Demo01Filter {
    public static void main(String[] args) {
        File f = new File("stage1/src/com/huben/c1_3");
        printFile(f);
    }

    private static void printFile(File f) {
        File[] files = f.listFiles(pathname -> pathname.isDirectory()||pathname.getName().startsWith("Test"));
        for (File file : files) {
            if (file.isFile()){
                System.out.println(file);
            }else {
                printFile(file);
            }
        }
    }
}
