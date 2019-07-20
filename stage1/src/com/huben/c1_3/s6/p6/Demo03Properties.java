package com.huben.c1_3.s6.p6;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Demo03Properties {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();

        FileReader fr = new FileReader("stage1/src/com/huben/c1_3/s6/p6/servlet.demo.txt");


        prop.load(fr);

        System.out.println(prop);
    }
}
