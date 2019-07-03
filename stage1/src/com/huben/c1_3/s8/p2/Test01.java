package com.huben.c1_3.s8.p2;

import java.util.ArrayList;
import java.util.Collections;

public class Test01 {
    public static void main(String[] args) {
        ArrayList<String> one = new ArrayList<>();
        ArrayList<String> two = new ArrayList<>();

        Collections.addAll(one, "迪丽热巴", "宋远桥", "苏星河", "石破天", "石中玉", "老子", "庄子", "洪七公");
        Collections.addAll(two, "古力娜扎", "张无忌", "赵丽颖", "张三丰", "尼古拉斯赵四", "张天爱", "张二狗");

        ArrayList<String> one1 = new ArrayList<>();
        for (String s : one) {
            if (s.length() == 3) {
                one1.add(s);
            }
        }
        ArrayList<String> one2 = new ArrayList<>();
        one2.add(one1.get(0));
        one2.add(one1.get(1));
        one2.add(one1.get(2));

        ArrayList<String> two1 = new ArrayList<>();
        for (String s : two) {
            if (s.startsWith("张")) {
                two1.add(s);
            }
        }
        two1.remove(0);
        two1.remove(0);

        ArrayList<String> team = new ArrayList<>();
        team.addAll(one2);
        team.addAll(two1);

        ArrayList<Person> people = new ArrayList<>();
        for (String s : team) {
            Person p = new Person(s);
            people.add(p);
        }
        System.out.println(people);
    }
}
