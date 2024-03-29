package cn.itcast.mq.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;

/**
 * @ClassName SpringAmqpTest
 * @Description TODO
 * @Author lmj
 * @Date 2023/3/21 14:51
 * @Version 1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringAmqpTest {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    public void testSendMessage2SimpleQueue() {
        String queueName = "simple.queue";
        String message = "hello, spring amqp!";
        rabbitTemplate.convertAndSend(queueName, message);
    }

    @Test
    public void testSendMessage2WorkQueue() throws InterruptedException {
        String queueName = "simple.queue";
        String message = "hello,message__";
        for (int i = 1; i < 50; i++) {
            rabbitTemplate.convertAndSend(queueName, message + i);
            Thread.sleep(20);
        }
    }

    @Test
    public void testSendFanoutExchange() {
        //交换机名称
        String exchangeName = "itcast.fanout";
        //消息
        String message = "hello,every one!";
        //发送消息
        rabbitTemplate.convertAndSend(exchangeName, "", message);
    }

    @Test
    public void testSendDirectExchange() {
        //交换机名称
        String exchangeName = "itcast.direct";
        //消息
        String message = "hello,red";
        //发送消息
        rabbitTemplate.convertAndSend(exchangeName, "red", message);
    }

    @Test
    public void testSendTopicExchange() {
        //交换机名称
        String exchangeName = "itcast.topic";
        //消息
        String message = "中国牛逼，华为牛逼！China世界第一，Huawei世界第一！";
        //发送消息
        rabbitTemplate.convertAndSend(exchangeName, "china.news", message);
    }

    @Test
    public void testSendObjectQueue() {
        HashMap<String, Object> msg = new HashMap<>();
        msg.put("name", "ld");
        msg.put("age", 19);

        rabbitTemplate.convertAndSend("object.queue", msg);
    }

}
