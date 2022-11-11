package com.lmj.mode.AbstractFactory.demo1.product;

public class EngineB implements Engine_{
    public EngineB() {
        System.out.println("制造-->EngineB");
    }

    @Override
    public void make() {
        System.out.println("开始制造发动机B");
    }
}
