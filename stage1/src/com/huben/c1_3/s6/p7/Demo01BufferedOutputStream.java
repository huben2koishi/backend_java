package com.huben.c1_3.s6.p7;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01BufferedOutputStream {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("stage1/src/com/huben/c1_3/s6/p7/test.txt");

        BufferedOutputStream bos = new BufferedOutputStream(fos);

        bos.write("将数据写入内部缓冲区".getBytes());
        bos.close();
    }
}
