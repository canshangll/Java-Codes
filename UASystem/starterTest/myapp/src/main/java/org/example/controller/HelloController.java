package org.example.controller;

import cn.lmj.log.MyLog;
import cn.lmj.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    private HelloService helloService;//当前实例已经由我们自定义的starter完成创建

    @MyLog(desc = "sayHello方法")
    @GetMapping("/say")
    public String sqyHello() {
        return helloService.sayHello();
    }


}
