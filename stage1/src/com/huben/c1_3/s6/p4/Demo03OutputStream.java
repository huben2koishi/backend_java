package com.huben.c1_3.s6.p4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo03OutputStream {
    public static void main(String[] args) throws IOException {
        File file = new File("stage1/src/com/huben/c1_3/s6/p4/test.md");

        FileOutputStream stream = new FileOutputStream(file, true);

        stream.write("\nworld".getBytes());

        stream.close();
    }
}
