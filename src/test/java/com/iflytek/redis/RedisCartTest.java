package com.iflytek.redis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
public class RedisCartTest {
    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    @Test
    public void carttest(){
        redisTemplate.boundHashOps("cart").put("8",1);

    }

}
