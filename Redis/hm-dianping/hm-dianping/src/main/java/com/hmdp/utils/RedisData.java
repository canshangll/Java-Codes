package com.hmdp.utils;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class RedisData {
    //逻辑时间
    private LocalDateTime expireTime;
    private Object data;
}
