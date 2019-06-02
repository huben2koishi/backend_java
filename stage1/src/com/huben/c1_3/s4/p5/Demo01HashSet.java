package com.huben.c1_3.s4.p5;

import java.util.HashSet;

public class Demo01HashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(1);

        for (Integer integer : set) {
            System.out.println(integer);
        }
    }
}
