package com.iflytek.redis;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import redis.clients.jedis.Jedis;

@SpringBootTest
public class JedisTest {

    @Test
    public void testString(){
        Jedis jedis =  new Jedis("localhost",6379);


        jedis.set("name","老王");

        String name = jedis.get("name");

        System.out.println(name);
    }
}
