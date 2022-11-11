package com.lmj.mode.Prototype.demo1.framework;

import java.util.HashMap;

public class Manager {
    private HashMap showcase = new HashMap();

    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }

    public Product create(String protoname) {
        Product p = (Product) showcase.get(protoname);//无法确定 到底是哪个类
        return p.createClone();
    }
}
