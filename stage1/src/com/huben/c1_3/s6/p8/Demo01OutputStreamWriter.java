package com.huben.c1_3.s6.p8;


import java.io.*;

public class Demo01OutputStreamWriter {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw1 = new OutputStreamWriter(new FileOutputStream("stage1/src/com/huben/c1_3/s6/p8/uft-8.txt"),"utf-8");
        osw1.write("utf-8 编码文件");

        OutputStreamWriter osw2 = new OutputStreamWriter(new FileOutputStream("stage1/src/com/huben/c1_3/s6/p8/gbk.txt"),"gbk");
        osw2.write("gbk 编码文件");

        osw1.close();
        osw2.close();
    }
}
