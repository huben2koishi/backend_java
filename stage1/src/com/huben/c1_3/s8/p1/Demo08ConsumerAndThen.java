package com.huben.c1_3.s8.p1;

import java.util.function.Consumer;

public class Demo08ConsumerAndThen {
    public static void main(String[] args) {
        consumeString(
                "hello",
                s -> System.out.println(s),
                s -> System.out.println(new StringBuilder(s).reverse().toString())
        );
    }

    private static void consumeString(String str, Consumer<String> consumer1, Consumer<String> consumer2) {
        consumer1.andThen(consumer2).accept(str);
    }
}
