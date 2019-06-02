package com.huben.c1_3.s1.p4;

import java.util.ArrayList;

public class Test03ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        printArrayList(list);
    }

    private static void printArrayList(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (i == 0) {
                System.out.print("{"+list.get(i));
            } else {
                System.out.print("@"+list.get(i));
            }
        }
        System.out.print("}");
    }
}
