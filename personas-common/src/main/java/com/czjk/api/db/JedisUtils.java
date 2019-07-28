package com.czjk.api.db;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.io.IOException;
import java.util.Properties;

public class JedisUtils {
    private static JedisPool pool;
    static {
        Properties properties = new Properties();
        try {
            properties.load(JedisUtils.class.getClassLoader()
                    .getResourceAsStream("redis.conf"));
            String host = properties.getProperty("redis.host");
            int port = Integer.valueOf(properties.getProperty("redis.port"));
            JedisPoolConfig config = new JedisPoolConfig();
            pool = new JedisPool(config,host,port);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Jedis getJedis(){
        return pool.getResource();
    }

    public static void release(Jedis jedis){
        jedis.close();
    }
}
