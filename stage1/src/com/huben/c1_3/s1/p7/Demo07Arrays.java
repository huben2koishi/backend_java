package com.huben.c1_3.s1.p7;

import java.util.Arrays;

public class Demo07Arrays {
    public static void main(String[] args) {

        // public static String toString(数组) 将数组转为字符串
        int[] nums = {4,2,1,3};
        System.out.println(Arrays.toString(nums));

        // public static void sort(数组) 将数组默认升序排序
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

    }
}
