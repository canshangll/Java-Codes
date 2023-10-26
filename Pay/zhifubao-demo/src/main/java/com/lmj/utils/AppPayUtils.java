package com.lmj.utils;

import java.io.FileWriter;
import java.io.IOException;

public class AppPayUtils {
    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "9021000124663058";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCLJtbXbal52/t1N6rC1VX9K+pjYfsrVYhwHkRw3p4fv29b8wub0HcfWUAAa8l8Wj8ApnH6CfpkRRT5YPvHz1FA3x+UIjsdDJSo6CIynnB+HPmdBQ5Zh7om3bKTlqnz7pAWRWr6DYzHwgm0ik6BsMJicSosYQ/o2NumlJGOFMA+rUKXehaV4zOE02g2lkpnYRJlZTzsRgbEzILcb1zY7SAPF5l06wWn4MvD1jL0R0kafH+dU5I/NT5onKkERdyswuzXppcEXEoTOSTclTGZ0kqg+tFse5tErYnqTjZggs6+jjaI3xtFMvCOaKI1fRWrB+A6b4/7YeL3l6ATJP6He/c/AgMBAAECggEAYnN4TbMo1S7vGl/oUTDfReBsVSRdsKszfR/tDG51McEf6M5syDEWFvfucF3SkEjJiow41893eLnnvQkBGr1zn5I9pXESodrk0xxqFaZDsPaPJKkPHgkJi7YPQpy2Yf/HsforVf+AO1TtyO6R3PBSl5O5YuzJdNT5k0JKOVw1KCIYqyR4ue2ydJ+XirvslCjYwgqW3X3XrKV5/TKUwpWs07wcoi5gA/Zv4XwB93sBQYR05jJ26E7tk+22x5iV10UnRjH+Vz+h8+AhUZNomh9g0ur4f5rTlMwCpl8G6RA5VG7BqpTBV8fNp3zRfsgkslIAHNK+C6lPA2rAru9Bl7CPAQKBgQD3ekZPn41WgsJuUNELJIClu+S/uvGju7smI1z71LCCHc3DzbqrY+3kLj4nMrjoxc+JY8QsFexUG3q5FaN+35mhg3w6bsEjH/l8eAKDk9JRl3GEv4ThAXfTwDvWbLqtknjS6V30qUF+W6K5L+3ynD5DYRrPlEHhwD04Xj6NtIEYewKBgQCP8ZRlcoBfjplNDcSWoDf7tSTVqVp0HWaorYTDqQP/D6B9rdd5QjwdVnSxMQ3MTCnsRbXA0tv2pxXdQ4eGs795jfmTICEbtkjni1Ojs6A+XnOBcVFuj1u+XdPvixAy/ZLhzgXETzdg+gDIAg+PNmnuNq/xhuK6ef5V5cAwH45bDQKBgEnQ8v/0+1d+kTgOawwDy0ukC8sUm9bWvC/YBHgpLKzi7ukkiDVvDRouoONYQcdMmWbFl1H/CAreV3C1f5rsXwrKCVf0iS9M7kGuGjHc+bLUlUufRKdIpNFIWZDPxa7YLanbaeb8RUjHVHYgUb031WqLoE+iTTRk/t29XrMt0APZAoGAHSeXIP0SF0iwsDSrrr6A2FCWR1hn48DYvC15CJBBKPYnUY1WaU8LEf4i4IjI/Kooi5yK9aU/vDOXcBtvZc8eZyZkeHI3gn9nQM6tgCivujIzPvKOxc/vix1CAfCutUU67NVnwZ0x4EiCw//22tDwn7kf5dGmNpLi+s7wIE8j7DkCgYA2WRoWanRrxDrVlrXT9I9TY6X5t7fQLPpKOYGjGghtyZ7Ju2E5LNXD+bKL9tZbuBS9q/ypxPViRxDBn249+jSwC0F3BkQiBuk6a8GZSCgTHYV7U0tuNxV03eyHsAaWvf/HPkWcY4kpVgyIH+dfEifqRMcAYXDSLHAiIP012YffjQ==";
    // 支付宝公钥
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAmmgVJjH+WZ991lamz+49tz1JzUjNpioM6834qVhzldXhfyWUl8BmQSHiiNrEM0hGEpHdNF/mRy/sf95oCsuJ/Yp1hOL+KfvE+n5NsllysgHCCQXx5w0qdnQLlbW6x8fW8U3HhFq7twrIB/JxA6YVGHlLF55S6EmJXnhIg80gaOsIpZL7jWa3hemhZmSaBiJS01TEAYasXufQlEagbkmI51zeypGN1F3WNSH6TXYM7lv5WQtBPINNkOx4oAtO76LSsQ918rLwgvUHxc5b7DZ/x0TFY3uR9vTFbG/a+iDpgO36mwnrTV12e+ukpoR0gmnUnKa13lvraYAFV0TgrXmlMwIDAQAB";

    // 服务器异步通知页面路径
    //需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://jq4hba.natappfree.cc/getnotify";

    // 页面跳转同步通知页面路径
    //需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://jq4hba.natappfree.cc/getreturn";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关,注意这些使用的是沙箱的支付宝网关，与正常网关的区别是多了dev
    public static String gatewayUrl = "https://openapi-sandbox.dl.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     *
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis() + ".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
