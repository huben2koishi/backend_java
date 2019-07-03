package com.huben.c1_3.s8.p2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class Test02 {
    public static void main(String[] args) {
        ArrayList<String> one = new ArrayList<>();
        ArrayList<String> two = new ArrayList<>();

        Collections.addAll(one, "迪丽热巴", "宋远桥", "苏星河", "石破天", "石中玉", "老子", "庄子", "洪七公");
        Collections.addAll(two, "古力娜扎", "张无忌", "赵丽颖", "张三丰", "尼古拉斯赵四", "张天爱", "张二狗");

        Stream<String> stream1 = one.stream();
        Stream<String> stream2 = two.stream();

        ArrayList<Person> team = new ArrayList<>();
        Stream<String> team1 = stream1.filter(s -> s.length() == 3).limit(3);
        Stream<String> team2 = stream2.filter(s -> s.startsWith("张")).skip(2);
        Stream.concat(team1,team2).map(s -> new Person(s)).forEach(s-> System.out.println(s));

    }
}
