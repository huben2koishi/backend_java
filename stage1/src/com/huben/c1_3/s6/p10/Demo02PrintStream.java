package com.huben.c1_3.s6.p10;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Demo02PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("输出到控制台");

        PrintStream ps = new PrintStream("stage1/src/com/huben/c1_3/s6/p10/servlet.demo.txt");
        System.setOut(ps);

        System.out.println("输出到文件");

        ps.close();
    }
}
