package com.huben.c1_3.s6.p8;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(new FileInputStream("stage1/src/com/huben/c1_3/s6/p8/servlet.demo-in.txt"), "gbk");
        OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("stage1/src/com/huben/c1_3/s6/p8/servlet.demo-out.txt"));


        int len = 0;
        while ((len=reader.read())!=-1){
            writer.write(len);
        }

        reader.close();
        writer.close();

    }
}
