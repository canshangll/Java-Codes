package com.lmj.gmall.service.impl;



import com.lmj.gmall.bean.UserAddress;
import com.lmj.gmall.service.OrderService;
import com.lmj.gmall.service.UserService;

import java.util.List;

public class OrderServiceImpl implements OrderService {

    UserService userService;

    @Override
    public void initOrder(String userId) {
        //1、查询用户的收货地址
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        System.out.println(addressList);
    }
}
