package com.huben.c1_3.s6.p7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo03BufferedWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("stage1/src/com/huben/c1_3/s6/p7/servlet.demo.txt");

        BufferedWriter bw= new BufferedWriter(fw);

        bw.write("hello你好");
        bw.newLine();
        bw.write("hello你好");

        bw.close();
    }
}
