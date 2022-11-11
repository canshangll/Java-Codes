package com.hmdp.service.impl;

import cn.hutool.core.util.StrUtil;
import cn.hutool.json.JSON;
import cn.hutool.json.JSONUtil;
import com.hmdp.dto.Result;
import com.hmdp.entity.ShopType;
import com.hmdp.mapper.ShopTypeMapper;
import com.hmdp.service.IShopTypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import static com.hmdp.utils.RedisConstants.CACHE_SHOP_TYPE_KEY;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author 虎哥
 * @since 2021-12-22
 */
@Service
public class ShopTypeServiceImpl extends ServiceImpl<ShopTypeMapper, ShopType> implements IShopTypeService {

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public Result typeList() {
        String key = CACHE_SHOP_TYPE_KEY;
        //1.从redis中查询缓存
        String typeJson = stringRedisTemplate.opsForValue().get(key);
        //2.判断是否存在
        if (StrUtil.isNotBlank(typeJson)) {
            List<ShopType> shopTypes = JSONUtil.toList(typeJson, ShopType.class);
            return Result.ok(shopTypes);
        }
        //4.不存在，查询数据库
        List<ShopType> typeList = query().orderByAsc("sort").list();
        //5.不存在，返回错误
        if (typeList == null) {
            return Result.fail("店铺分类不存在！");
        }
        //6.存在，写入redis
        stringRedisTemplate.opsForValue().set(key,JSONUtil.toJsonStr(typeList));
        return Result.ok(typeList);
    }
}
