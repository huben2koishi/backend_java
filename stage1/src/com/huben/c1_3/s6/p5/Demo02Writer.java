package com.huben.c1_3.s6.p5;

import java.io.FileWriter;
import java.io.IOException;

public class Demo02Writer {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("stage1/src/com/huben/c1_3/s6/p5/servlet.demo.txt",true);

        writer.write(97);

        char[] chars= {'b','c','d'};
        writer.write(chars);

        String str = "efg";
        writer.write(str);

        writer.flush();
        writer.close();

    }
}
