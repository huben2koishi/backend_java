package com.huben.c1_3.s4.p7;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo03EntrySet {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("first", 11);
        map.put("second", 22);
        map.put("third", 33);
        map.put("forth", 44);

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
    }
}
