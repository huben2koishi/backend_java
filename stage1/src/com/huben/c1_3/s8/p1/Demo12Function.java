package com.huben.c1_3.s8.p1;

import java.util.function.Function;

public class Demo12Function {
    public static void main(String[] args) {
        String num = str2int2str("200",
                s -> Integer.parseInt(s),
                n -> n*10+"");
        System.out.println(num);
    }

    private static String str2int2str(String str, Function<String,Integer> function1, Function<Integer,String> function2){
        return function1.andThen(function2).apply(str);
    }
}
