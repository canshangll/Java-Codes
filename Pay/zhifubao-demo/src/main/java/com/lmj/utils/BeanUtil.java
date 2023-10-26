package com.lmj.utils;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.alipay.api.request.AlipayTradePayRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanUtil {
    //创建支付宝所需要的对象
    @Bean
    public AlipayClient alipayClient() {
        return new DefaultAlipayClient(AppPayUtils.gatewayUrl, AppPayUtils.app_id, AppPayUtils.merchant_private_key, "json", AppPayUtils.charset,
                AppPayUtils.alipay_public_key, AppPayUtils.sign_type);
    }

    //支付信息的配置
    @Bean
    public AlipayTradePagePayRequest alipayTradePayRequest(){
        return  new AlipayTradePagePayRequest();
    }

}
