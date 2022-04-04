package com.iflytek.redis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest
public class TemplateTest {

    @Autowired
    private RedisTemplate<String,Object>  redisTemplate;

    @Test
    public void testString(){
        redisTemplate.opsForValue().set("age","18");
        Object age = redisTemplate.opsForValue().get("age");
        System.out.println(age);
    }
}
