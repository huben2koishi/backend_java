package com.huben.c1_3.s4.p7;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo02KeySet {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("first", 11);
        map.put("second", 22);
        map.put("third", 33);
        map.put("forth", 44);

        // public Set<K> keySet() 将 map 的所有键存储到 set 中
        Set<String> set = map.keySet();
        System.out.println(set);

        // 遍历 map
        for (String s : set) {
            System.out.println(s+": "+map.get(s));
        }

    }
}
