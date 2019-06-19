package com.huben.c1_3.s6.p2;

import java.io.File;

public class Test02 {
    public static void main(String[] args) {
        File f = new File("stage1/src/com/huben/c1_3/");
        printFile(f);
    }

    private static void printFile(File f) {
        File[] files = f.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()){
                    String name = file.getName();

                    if (name.startsWith("Test")){
                        System.out.println(file);
                    }
                } else {
                    printFile(file);
                }
            }
        }
    }


}
