package com.huben.c1_3.s8.p3;

import java.util.Arrays;

public class Demo07ArrayConstructor {
    public static void main(String[] args) {
        int[] array = createArray(6, int[]::new);
        System.out.println(Arrays.toString(array));
    }

    private static int[] createArray(int length, ArrayBuilder builder){
        return builder.buildArray(length);
    }
}
