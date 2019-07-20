package com.huben.c1_3.s6.p4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo04InputStream {
    public static void main(String[] args) throws IOException {
        File file = new File("stage1/src/com/huben/c1_3/s6/p4/servlet.demo.md");

        FileInputStream stream = new FileInputStream(file);

        int len = 0;
        while ((len = stream.read()) != -1) {
            System.out.print((char)len);
        }
    }
}
