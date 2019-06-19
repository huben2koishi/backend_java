package com.huben.c1_3.s6.p4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo02OutputStream {
    public static void main(String[] args) throws IOException {
        File file = new File("stage1/src/com/huben/c1_3/s6/p4/test.md");

        FileOutputStream stream = new FileOutputStream(file);
        byte[] bytes = "hello".getBytes();
        stream.write(bytes);

        byte[] numbers = {48,49,50,51,52,53,54,55,56,57};
        stream.write(numbers);

        stream.write(65);

        stream.close();
    }
}
