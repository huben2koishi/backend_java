package com.huben.c1_3.s4.p7;

import java.util.HashMap;

public class Demo04MapSaveObject {
    public static void main(String[] args) {
        HashMap<Person, String> hashMap = new HashMap<>();
        hashMap.put(new Person("张三",12), "北京");
        hashMap.put(new Person("李四",23), "上海");
        hashMap.put(new Person("王二",14), "广东");
        hashMap.put(new Person("张三",12), "北京西");

        System.out.println(hashMap);

    }
}
