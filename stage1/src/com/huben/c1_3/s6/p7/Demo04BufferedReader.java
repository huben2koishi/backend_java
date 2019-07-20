package com.huben.c1_3.s6.p7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo04BufferedReader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("stage1/src/com/huben/c1_3/s6/p7/servlet.demo.txt");

        BufferedReader br = new BufferedReader(fr);

//        int len = 0;
//        while ((len=br.read())!=-1){
//            System.out.print((char)len);
//        }

        String str;
        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }

        br.close();
    }
}
