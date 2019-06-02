package com.huben.c1_3.s1.p4;

import java.util.ArrayList;
import java.util.Random;

public class Test01ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 6; i++) {
            list.add(r.nextInt(33)+1);
        }

        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
