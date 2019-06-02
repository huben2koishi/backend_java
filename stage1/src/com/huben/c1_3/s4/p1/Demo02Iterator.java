package com.huben.c1_3.s4.p1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo02Iterator {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("hello");
        collection.add("world");
        collection.add("java");

        Iterator<String> iterator = collection.iterator();

        while (iterator.hasNext()){
            String str= iterator.next();
            System.out.println(str);
        }
    }
}
