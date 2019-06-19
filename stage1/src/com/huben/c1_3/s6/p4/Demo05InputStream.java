package com.huben.c1_3.s6.p4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo05InputStream {
    public static void main(String[] args) throws IOException {
        File file = new File("stage1/src/com/huben/c1_3/s6/p4/test.md");

        FileInputStream stream = new FileInputStream(file);

        byte[] hello = new byte[5];
        System.out.println(stream.read(hello));
        System.out.println(Arrays.toString(hello));
        System.out.println(new String(hello));

        stream.close();
    }
}
