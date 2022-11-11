package com.lmj.mode.FactoryMethod.demo1.idcard;

import com.lmj.mode.FactoryMethod.demo1.framework.Product;

public class IDCard extends Product {
    private String owner;
    private Long id;

    IDCard(String owner,Long id) {
        System.out.println(" 制作 " + owner + " 的ID卡:" + id + "。");
        this.id = id;
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(" 使用 " + owner + " 的ID卡:" + id + "。");
    }

    public Long getId() {
        return id;
    }

    public String getOwner() {
        return owner;
    }
}
