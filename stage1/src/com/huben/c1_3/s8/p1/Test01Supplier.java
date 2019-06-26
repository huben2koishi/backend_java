package com.huben.c1_3.s8.p1;

import java.util.function.Supplier;

public class Test01Supplier {
    public static void main(String[] args) {
        int[] arr = {3, 4, 67, 23, 54, 8};

        int result = getMax(() -> {
            int max = arr[0];
            for (int i : arr) {
                if (i > max) {
                    max = i;
                }
            }
            return max;
        });
        System.out.println(result);
    }

    private static int getMax(Supplier<Integer> supplier) {
        return supplier.get();
    }
}
