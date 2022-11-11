package com.lmj.mode.AbstractFactory.demo1.product;

public class AirconditionB implements Aircondition_{
    public AirconditionB() {
        System.out.println("制造-->AirconditionB");
    }
    @Override
    public void make() {
        System.out.println("开始制造空调B");
    }
}
