package com.huben.c1_3.s6.p7;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo02BufferedInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("stage1/src/com/huben/c1_3/s6/p7/servlet.demo.txt");

        BufferedInputStream bis = new BufferedInputStream(fis);

//        int len = 0;
//        while ((len = bis.read()) != -1) {
//            System.out.println(len);
//        }

        byte[] bytes = new byte[1024];
        int len2 = 0;
        while ((len2 = bis.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len2));
        }

        bis.close();
    }
}
