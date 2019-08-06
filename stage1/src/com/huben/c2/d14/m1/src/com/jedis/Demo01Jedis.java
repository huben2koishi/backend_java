package com.jedis;

import redis.clients.jedis.Jedis;

import java.util.List;
import java.util.Map;

public class Demo01Jedis {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost",6379);

        // 字符串
        jedis.set("name","Mike");
        String name = jedis.get("name");
        System.out.println(name);

        // Hash
        jedis.hset("person","name","Jack");
        jedis.hset("person","age","18");
        Map<String, String> map = jedis.hgetAll("person");
        for (String s : map.keySet()) {
            System.out.println(s+"->"+map.get(s));
        }

        // List
        jedis.lpush("nums","a","b","c");
        jedis.rpush("nums","d");
        List<String> nums = jedis.lrange("nums", 0, -1);
        for (String num : nums) {
            System.out.print(num+"->");
        }
        System.out.println();


        jedis.close();
    }
}
