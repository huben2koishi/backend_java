package com.huben.c1_3.s8.p1;

import java.util.function.Consumer;

public class Demo07Consumer {
    public static void main(String[] args) {
        consumeString("hello",s -> System.out.println(s));
        consumeString("world",s -> System.out.println(s));
    }

    private static void consumeString(String str,Consumer<String> consumer) {
        consumer.accept(str);
    }
}
