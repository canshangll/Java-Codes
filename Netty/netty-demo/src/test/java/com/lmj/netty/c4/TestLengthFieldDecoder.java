package com.lmj.netty.c4;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.embedded.EmbeddedChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;

public class TestLengthFieldDecoder {
    public static void main(String[] args) {
        EmbeddedChannel channel = new EmbeddedChannel(
                new LengthFieldBasedFrameDecoder(
                        1024, 0, 4, 0, 0),
                new LoggingHandler(LogLevel.DEBUG)
        );

        // 4 个字节的内容长度，实际内容
        ByteBuf buffer = ByteBufAllocator.DEFAULT.buffer();
        sebd(buffer, "hello,world");
        sebd(buffer, "hi!");
        channel.writeInbound(buffer);
    }

    private static void sebd(ByteBuf buffer, String content) {
        byte[] bytes = content.getBytes(); // 实际内容
        int length = bytes.length; // 实际内容长度
        buffer.writeInt(length);
        buffer.writeByte(1);
        buffer.writeBytes(bytes);
    }
}
