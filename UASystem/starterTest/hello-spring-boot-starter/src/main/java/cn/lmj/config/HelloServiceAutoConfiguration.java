package cn.lmj.config;

import cn.lmj.service.HelloService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自动配置类，用于自动配置HelloService对象
 */
@Configuration
@EnableConfigurationProperties(value = HelloProperties.class)
public class HelloServiceAutoConfiguration {

    private HelloProperties helloProperties;

    //通过构造方法注入配置属性对象HelloProperties
    public HelloServiceAutoConfiguration(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }

    @ConditionalOnMissingBean
    @Bean
    public HelloService helloService() {
        return new HelloService(helloProperties.getName(), helloProperties.getAddress());
    }
}
