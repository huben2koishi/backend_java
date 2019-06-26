package com.huben.c1_3.s8.p1;

import java.util.function.Predicate;

public class Test04Predicate {
    public static void main(String[] args) {
        String[] arr = {"张三三,男", "李四,女", "王五五,男", "赵六,男"};

        for (String s : arr) {
            if (findMen(s,
                    (str) -> s.split(",")[0].length() == 3,
                    (str) -> s.split(",")[1].equals("男")
            )) {
                System.out.println(s);
            }
        }
    }

    private static boolean findMen(String str, Predicate<String> predicate1, Predicate<String> predicate2) {
        return predicate1.and(predicate2).test(str);
    }
}
