package com.huben.c1_3.s6.p6;

import java.util.Properties;
import java.util.Set;

public class Demo01Properties {
    public static void main(String[] args) {
        Properties prop = new Properties();

        prop.setProperty("name","Mike");
        prop.setProperty("job","driver");
        prop.setProperty("age","24");

        Set<String> set = prop.stringPropertyNames();

        for (String key : set) {
            System.out.println(key+" -> "+prop.getProperty(key));
        }

    }
}
