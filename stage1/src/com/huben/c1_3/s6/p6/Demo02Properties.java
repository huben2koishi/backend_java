package com.huben.c1_3.s6.p6;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Demo02Properties {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();

        prop.setProperty("name","Mike");
        prop.setProperty("job","driver");
        prop.setProperty("age","24");

        FileWriter fw = new FileWriter("stage1/src/com/huben/c1_3/s6/p6/test.txt");

        prop.store(fw,"save");

        fw.close();
    }
}
