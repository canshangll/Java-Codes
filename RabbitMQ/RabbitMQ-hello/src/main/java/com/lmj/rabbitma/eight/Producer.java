package com.lmj.rabbitma.eight;

import com.lmj.rabbitma.utils.RabbitMqUtils;
import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;

/**
 * 死信队列 之 生产者代码
 */
public class Producer {
    //普通交换机的名称
    public static final String NORMAL_EXCHANGE = "normal_exchange";
    public static void main(String[] args) throws Exception {
        Channel channel = RabbitMqUtils.getChannel();
        //死信消息 设置TTL时间 单位ms
//        AMQP.BasicProperties properties =
//                new AMQP.BasicProperties()
//                .builder().expiration("10000").build();
        for (int i = 1; i < 11; i++) {
            String message = "info" + i;//info2 ..... info10
            channel.basicPublish(NORMAL_EXCHANGE, "zhangsan", null, message.getBytes());
        }
    }
}
