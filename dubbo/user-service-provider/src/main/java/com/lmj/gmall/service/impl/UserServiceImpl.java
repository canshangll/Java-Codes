package com.lmj.gmall.service.impl;


import com.lmj.gmall.bean.UserAddress;
import com.lmj.gmall.service.UserService;

import java.util.Arrays;
import java.util.List;

public class UserServiceImpl implements UserService {

    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress address1 = new UserAddress(1, "中山市技师学院东校区", "1", "张老师", "12345678912", "y");
        UserAddress address2 = new UserAddress(2, "中山市技师学院北校区", "1", "刘老师", "98745612312", "y");
        return Arrays.asList(address1, address2);
    }
}
