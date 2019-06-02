package com.huben.c1_3.s4.p5;

import java.util.HashSet;

public class Demo03HashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        String s1 = new String("abc");
        String s2 = new String("abc");
        set.add(s1);
        set.add(s2);
        set.add("hello");
        set.add("world");
        set.add("abc");

        System.out.println(set);
    }
}
