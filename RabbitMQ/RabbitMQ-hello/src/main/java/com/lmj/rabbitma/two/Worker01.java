package com.lmj.rabbitma.two;

import com.lmj.rabbitma.utils.RabbitMqUtils;
import com.rabbitmq.client.CancelCallback;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.DeliverCallback;

/**
 * 这是一个工作线程（相当于之前的消费者）
 */
public class Worker01 {
    //队列名称
    public static final String QUEUE_NAME = "hello";
    //接收消息
    public static void main(String[] args) throws Exception {
        Channel channel = RabbitMqUtils.getChannel();
        //声明 接收消息
        DeliverCallback deliverCallback = (consumerTag, message) -> {
            System.out.println("接收到的消息：" + new String(message.getBody()));
        };
        //取消消息时的回调
        CancelCallback cancelCallback = consumerTag -> {
            System.out.println(consumerTag + "消息者取消消费接口回调逻辑");
        };
        System.out.println("C2等待接收消息.....");
        //消息的接收
        channel.basicConsume(QUEUE_NAME, true, deliverCallback, cancelCallback);
    }
}
