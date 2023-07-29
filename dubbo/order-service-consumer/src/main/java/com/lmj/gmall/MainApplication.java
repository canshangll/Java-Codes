package com.lmj.gmall;

import com.lmj.gmall.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class MainApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ioc =
                new ClassPathXmlApplicationContext("consumer.xml");
        OrderService orderservice = ioc.getBean(OrderService.class);
        orderservice.initOrder("1");
        System.out.println("调用完成");
        System.in.read();
    }
}
