package com.huben.c1_3.s1.p4;

import java.util.ArrayList;

public class Demo04ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Hello");
        list.add("World");

        // 使用 for 遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // 简略写法
        for (String s : list) {
            System.out.println(s);
        }
    }
}
