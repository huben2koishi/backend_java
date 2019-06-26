package com.huben.c1_3.s8.p1;

import java.util.function.Function;

public class Demo11Function {
    public static void main(String[] args) {
        int num = str2int("200",s -> Integer.parseInt(s));
        System.out.println(num);
    }

    private static int str2int(String str, Function<String,Integer> function){
        return function.apply(str);
    }
}
