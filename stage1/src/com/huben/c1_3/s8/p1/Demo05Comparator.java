package com.huben.c1_3.s8.p1;

import java.util.Arrays;
import java.util.Comparator;

public class Demo05Comparator {
    public static void main(String[] args) {
        String[] arr = {"abc","ab","abcd"};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr,newComparator());
        System.out.println(Arrays.toString(arr));
    }

    private static Comparator<String> newComparator() {
        return (a, b) -> b.length() - a.length();
    }
}
