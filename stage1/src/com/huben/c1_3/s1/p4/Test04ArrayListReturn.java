package com.huben.c1_3.s1.p4;

import java.util.ArrayList;
import java.util.Random;

public class Test04ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 20; i++) {
            list.add(r.nextInt(11));
        }

        ArrayList<Integer> result = selectList(list);
        System.out.println(result);
    }

    private static ArrayList<Integer> selectList(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();

        for (Integer integer : list) {
            if (integer%2==0) {
                result.add(integer);
            }
        }

        return result;
    }
}
