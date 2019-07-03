package com.huben.c1_3.s8.p2;

import java.util.stream.Stream;

public class Demo09Concat {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("张三三", "李四");
        Stream<String> stream2 = Stream.of("王二二", "张五五");

        Stream.concat(stream1,stream2).forEach(s -> System.out.println(s));
    }
}
