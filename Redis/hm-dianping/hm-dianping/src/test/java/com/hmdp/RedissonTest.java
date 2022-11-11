package com.hmdp;

import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@Slf4j
@SpringBootTest
public class RedissonTest {

    @Resource
    public RedissonClient redissonClient;
    @Resource
    public RedissonClient redissonClient2;
    @Resource
    public RedissonClient redissonClient3;

    private RLock lock;

    @Before
    public void setUp() {
        RLock lock1 = redissonClient.getLock("order");
        RLock lock2 = redissonClient2.getLock("order");
        RLock lock3 = redissonClient3.getLock("order");

        //创建联锁 multiLock
        lock = redissonClient.getMultiLock(lock1, lock2, lock3);
    }

    @Test
    public void testRedisson() throws Exception {
        //获取锁(可重入)，指定锁的名称
        RLock lock = redissonClient.getLock("order");
        //尝试获取锁，参数分别是：获取锁的最大等待时间(期间会重试)，锁自动释放时间，时间单位
        boolean isLock = lock.tryLock(1, 10, TimeUnit.SECONDS);
        //判断获取锁成功
        if (isLock) {
            try {
                System.out.println("执行业务");
            } finally {
                //释放锁
                lock.unlock();
            }

        }
    }

    @Test
    public void method1() {
        //尝试获取锁
        boolean isLock = lock.tryLock();
        if (!isLock) {
            log.error("获取锁失败 .... 1");
            return;
        }
        try {
            log.info("获取锁成功 .... 1");
            method2();
            log.info("开始执行业务 .... 1");
        } finally {
            log.warn("准备释放锁 .... 1");
            lock.unlock();
        }
    }

    @Test
    public void method2() {
        //尝试获取锁
        boolean isLock = lock.tryLock();
        if (!isLock) {
            log.error("获取锁失败 .... 2");
            return;
        }
        try {
            log.info("获取锁成功 .... 2");
            log.info("开始执行业务 .... 2");
        } finally {
            log.warn("准备释放锁 .... 2");
            lock.unlock();
        }
    }

}

