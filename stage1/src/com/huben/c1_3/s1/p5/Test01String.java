package com.huben.c1_3.s1.p5;

public class Test01String {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3};
        String str = arrayToString(ints);

        System.out.println(str);
    }

    private static String arrayToString(int[] ints) {
        String str = "[";

        for (int i = 0; i < ints.length; i++) {
            if (i == ints.length - 1) {
                str = str.concat("word" + ints[i] + "]");
            } else {
                str = str.concat("word" + ints[i] + "#");
            }
        }

        return str;
    }
}
