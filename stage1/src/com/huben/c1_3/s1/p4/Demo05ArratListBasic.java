package com.huben.c1_3.s1.p4;

import java.util.ArrayList;

public class Demo05ArratListBasic {
    public static void main(String[] args) {
        // 泛型只能是引用类型, 不能是基本类型
        // 要想在 ArrayList 中存储基本类型, 可以使用包装类

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
    }
}
