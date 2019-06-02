package com.huben.c1_3.s4.p1;

import java.util.ArrayList;
import java.util.Collection;

public class Demo03Foreach {
    public static void main(String[] args) {

        // 增强 for 循环遍历数组
        int[] arr = {1,3,5,7,9};
        for (int i : arr) {
            System.out.println(i);
        }

        // 增强 for 循环遍历集合
        Collection<String> collection = new ArrayList<>();
        collection.add("hello");
        collection.add("world");
        collection.add("java");

        for (String s : collection) {
            System.out.println(s);
        }
    }
}
