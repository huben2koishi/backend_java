package com.huben.c1_3.s6.p1;

import java.io.File;
import java.util.Arrays;

public class Demo04File {
    public static void main(String[] args) {
        File f1 = new File("stage1/src/com/huben/c1_3/s6/p1");
        System.out.println(Arrays.toString(f1.list()));
    }
}
