package com.huben.c1_3.s8.p2;

import java.util.ArrayList;
import java.util.Collections;

public class Demo01Stream {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张三三", "李四", "王二二", "张五五");

        list.stream()
                .filter(s -> s.length() == 3)
                .filter(s -> s.startsWith("张"))
                .forEach(s -> System.out.println(s));
    }
}
