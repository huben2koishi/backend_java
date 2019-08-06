package com.jedis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class Demo02Jedis {
    public static void main(String[] args) {
        JedisPool jedisPool = new JedisPool();
        Jedis jedis = jedisPool.getResource();

        jedis.set("test","ok");
        System.out.println(jedis.get("test"));

        jedis.close();
    }
}
