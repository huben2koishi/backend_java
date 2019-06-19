package com.huben.c1_3.s6.p4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01FileCopy {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("C:\\Users\\hasee\\Pictures\\wallpaper\\kokoro.png");
        FileOutputStream fos = new FileOutputStream("stage1/src/com/huben/c1_3/s6/p4/1.png");

        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes,0,len);
        }

        fis.close();
        fos.close();
    }
}
