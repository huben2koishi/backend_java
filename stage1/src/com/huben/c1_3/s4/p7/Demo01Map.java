package com.huben.c1_3.s4.p7;

import java.util.HashMap;
import java.util.Map;

public class Demo01Map {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        String s1 = map.put("name","Mike");
        String s2 = map.put("age","18");
        System.out.println(s1); // null
        System.out.println(s2); // null

        // public V put(K key, V value) 添加或更改 返回被替换的 value
        String s3 = map.put("age","16");
        System.out.println(s3); // 16
        System.out.println(map); // {name=Mike, age=16}

        // public V remove(K key) 删除 返回被删除的 value
        String s4 = map.remove("age");
        System.out.println(s4); // 16
        System.out.println(map); // {name=Mike}

        // public V get(K key) 返回指定 key 的 value
        System.out.println(map.get("name")); // Mike

        // public boolean containsKey(K key) 返回是否包含 key
        System.out.println(map.containsKey("name")); // true

    }
}
