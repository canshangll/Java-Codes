package com.lmj.protocol;

import com.lmj.message.LoginRequestMessage;
import io.netty.channel.embedded.EmbeddedChannel;
import io.netty.handler.logging.LoggingHandler;

public class TestMessageCodec {
    public static void main(String[] args) {
        EmbeddedChannel channel = new EmbeddedChannel(
                new LoggingHandler(),
                new MessageCodec());

        LoginRequestMessage message = new LoginRequestMessage("zhangsan", "123", "张三");
        channel.writeOutbound(message);

    }
}
