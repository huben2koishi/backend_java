package com.huben.c1_3.s4.p5;

import java.util.LinkedHashSet;

public class Demo05LinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> linked = new LinkedHashSet<>();
        linked.add("query");
        linked.add("string");
        linked.add("query");
        linked.add("back");
        System.out.println(linked);
    }
}
