package com.lmj.gmall.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.lmj.gmall.bean.UserAddress;
import com.lmj.gmall.service.UserService;
import org.springframework.stereotype.Component;


import java.util.Arrays;
import java.util.List;

@Service //暴露服务  import com.alibaba.dubbo.config.annotation.Service;
@Component
public class UserServiceImpl implements UserService {

    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress address1 = new UserAddress(1, "中山市技师学院东校区", "1", "张老师", "12345678912", "y");
        UserAddress address2 = new UserAddress(2, "中山市技师学院北校区", "1", "刘老师", "98745612312", "y");
        return Arrays.asList(address1, address2);
    }
}
