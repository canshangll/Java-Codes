package com.lmj.mode.AbstractFactory.demo1.product;

public class EngineA implements Engine_ {
    public EngineA() {
        System.out.println("制造-->EngineA");
    }

    @Override
    public void make() {
        System.out.println("开始制造发动机A");
    }
}
