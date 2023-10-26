package com.lmj.controller;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.lmj.utils.AppPayUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class PayController {

    @Resource
    private AlipayClient alipayClient;
    @Resource
    private AlipayTradePagePayRequest alipayTradePagePayRequest;

    //支付请求接口
    //接收数据：订单号、金额、名称、商品描述
    @RequestMapping("/pay")
    public void pay(String WIDout_trade_no,
                    String WIDsubject,
                    String WIDtotal_amount,
                    String WIDbody,
                    HttpServletResponse response) throws AlipayApiException, IOException {
        //获得支付的客户端 AlipayClient
        //设置响应的地址（支付宝返回给商户的相应地址）
        alipayTradePagePayRequest.setNotifyUrl(AppPayUtils.notify_url);
        alipayTradePagePayRequest.setReturnUrl(AppPayUtils.return_url);
        //设置请求的参数（传递给支付宝的数据）
        alipayTradePagePayRequest.setBizContent(
                "{\"out_trade_no\":\""+ WIDout_trade_no +"\","
                        + "\"total_amount\":\""+ WIDtotal_amount +"\","
                        + "\"subject\":\""+ WIDsubject +"\","
                        + "\"body\":\""+ WIDbody +"\","
                        + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}"
        );
        //发送请求
        String result = alipayClient.pageExecute(alipayTradePagePayRequest).getBody();
        //将响应结果返回给前端
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().println(result);
    }
}
