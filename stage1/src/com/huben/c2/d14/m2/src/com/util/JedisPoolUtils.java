package com.util;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class JedisPoolUtils {
    private static JedisPool jedisPool;

    static {
        //读取配置文件
        InputStream is = JedisPoolUtils.class.getClassLoader().getResourceAsStream("jedis.properties");
        //创建Properties对象
        Properties properties = new Properties();
        //关联文件
        try {
            properties.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(Integer.parseInt(properties.getProperty("maxTotal")));
        config.setMaxTotal(Integer.parseInt(properties.getProperty("maxIdle")));

        jedisPool=new JedisPool(config,properties.getProperty("host"),Integer.parseInt(properties.getProperty("port")));

    }

    public static Jedis getJedis(){
        return jedisPool.getResource();
    }
}
