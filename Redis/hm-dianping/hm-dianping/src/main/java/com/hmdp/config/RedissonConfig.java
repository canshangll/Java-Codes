package com.hmdp.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.client.RedisClient;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class RedissonConfig {

    @Bean
    public RedissonClient redissonClient() {
        //配置
        Config config = new Config();
        config.useSingleServer().setAddress("redis://1.12.63.198:6379").setPassword("Ll13422849999l...Redis@#$");
        //创建RedissonClient对象
        return Redisson.create(config);
    }
    @Bean
    public RedissonClient redissonClient2() {
        //配置
        Config config = new Config();
        config.useSingleServer().setAddress("redis://1.12.63.198:6380").setPassword("Ll13422849999l...Redis@#$");
        //创建RedissonClient对象
        return Redisson.create(config);
    }
    @Bean
    public RedissonClient redissonClient3() {
        //配置
        Config config = new Config();
        config.useSingleServer().setAddress("redis://1.12.63.198:6381").setPassword("Ll13422849999l...Redis@#$");
        //创建RedissonClient对象
        return Redisson.create(config);
    }

}
