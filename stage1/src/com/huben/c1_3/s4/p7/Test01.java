package com.huben.c1_3.s4.p7;

import java.util.HashMap;

public class Test01 {
    public static void main(String[] args) {
        String str = "aabbbcccdddddd";

        HashMap<Character,Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (!map.containsKey(c)){
                map.put(c,1);
            } else {
                Integer i = map.get(c);
                i++;
                map.put(c,i);
            }
        }
        System.out.println(map);

    }
}
