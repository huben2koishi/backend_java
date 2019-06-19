package com.huben.c1_3.s6.p5;

import java.io.FileReader;
import java.io.IOException;

public class Demo01Reader {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("stage1/src/com/huben/c1_3/s6/p5/test.txt");
        int len=0;
        while ((len=reader.read())!=-1){
            System.out.print((char)len);
        }

        reader.close();
    }
}
