package com.huben.c1_3.s8.p2;

import java.util.stream.Stream;

public class Demo05Map {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三三", "李四", "王二二", "张五五");

        stream.map(s -> s+s.length()).forEach(s -> System.out.println(s));
    }
}
