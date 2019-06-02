package com.huben.c1_3.s1.p4;

import java.util.ArrayList;

public class Demo02ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        // 对于 ArrayList, 直接打印会得到其内容, 而非地址值
        System.out.println(list); // []

        // 添加元素
        list.add("hello");
        list.add("world");
        list.add("!");

        System.out.println(list);

    }
}
