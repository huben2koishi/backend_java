package com.huben.c1_3.s6.p10;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Demo01PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("stage1/src/com/huben/c1_3/s6/p10/test.txt");

        ps.write(97);
        ps.print(97);

        ps.close();
    }
}
