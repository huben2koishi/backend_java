package com.huben.c1_3.s4.p7;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Demo05LinkedHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("AAA",11);
        hashMap.put("BBB",22);
        hashMap.put("CCC",33);
        hashMap.put("DDD",44);

        System.out.println(hashMap); // {AAA=11, CCC=33, BBB=22, DDD=44}


        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("AAA",11);
        linkedHashMap.put("BBB",22);
        linkedHashMap.put("CCC",33);
        linkedHashMap.put("DDD",44);
        System.out.println(linkedHashMap); // {AAA=11, BBB=22, CCC=33, DDD=44}
    }
}
