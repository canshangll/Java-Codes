package cn.itcast.mq.listener;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import javax.lang.model.type.ExecutableType;
import java.time.LocalDateTime;
import java.util.Map;

/**
 * @ClassName SpringRabbitListener
 * @Description TODO
 * @Author lmj
 * @Date 2023/3/21 14:59
 * @Version 1.0
 **/
@Component
public class SpringRabbitListener {

//    @RabbitListener(queues = "simple.queue")
//    public void listenSimpleQueue(String msg) {
//        System.out.println("消费者接收到simple.queue的消息：{" + msg + "}");
//    }

    @RabbitListener(queues = "simple.queue")
    public void listenWorkQueue1(String msg) throws InterruptedException {
        System.out.println("消费者1_____接收到消息：{" + msg + "}" + LocalDateTime.now());
        Thread.sleep(20);
    }

    @RabbitListener(queues = "simple.queue")
    public void listenWorkQueue2(String msg) throws InterruptedException {
        System.err.println("消费者2..............接收到消息：{" + msg + "}" + LocalDateTime.now());
        Thread.sleep(200);
    }

    @RabbitListener(queues = "fanout.queue1")
    public void listenFanoutQueue1(String msg) {
        System.out.println("消费者接收到Fanout.queue1的消息：{" + msg + "}");
    }

    @RabbitListener(queues = "fanout.queue2")
    public void listenFanoutQueue2(String msg) {
        System.out.println("消费者接收到Fanout.queue2的消息：{" + msg + "}");
    }

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(name = "direct.queue1"),
            exchange = @Exchange(name = "itcast.direct", type = ExchangeTypes.DIRECT),
            key = {"red", "blue"}
    ))
    public void listenDirectQueue1(String msg) {
        System.out.println("消费者接收到direct.queue1的消息：{" + msg + "}");
    }

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(name = "direct.queue2"),
            exchange = @Exchange(name = "itcast.direct", type = ExchangeTypes.DIRECT),
            key = {"red", "yellow"}
    ))
    public void listenDirectQueue2(String msg) {
        System.out.println("消费者接收到direct.queue2的消息：{" + msg + "}");
    }

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(name = "topic.queue1"),
            exchange = @Exchange(name = "itcast.topic", type = ExchangeTypes.TOPIC),
            key = "china.#"
    ))
    public void listenTopicQueue1(String msg) {
        System.out.println("消费者接收到Topic.queue1的消息：{" + msg + "}");
    }

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(name = "topic.queue2"),
            exchange = @Exchange(name = "itcast.topic", type = ExchangeTypes.TOPIC),
            key = "#.news"
    ))
    public void listenTopicQueue2(String msg) {
        System.out.println("消费者接收到Topic.queue2的消息：{" + msg + "}");
    }

    @RabbitListener(queues = "object.queue")
    public void listenObjectQueue(Map<String, Object> msg) {
        System.out.println("接收到object.queue的消息：" + msg);
    }

}
