package com.lmj.server.handler;

import com.lmj.message.GroupMembersRequestMessage;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

@ChannelHandler.Sharable
public class GroupMemberRequestMessageHandler extends SimpleChannelInboundHandler<GroupMembersRequestMessage> {
    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, GroupMembersRequestMessage groupMembersRequestMessage) throws Exception {

    }
}
