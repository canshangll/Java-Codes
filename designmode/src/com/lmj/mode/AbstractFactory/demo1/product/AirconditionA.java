package com.lmj.mode.AbstractFactory.demo1.product;

public class AirconditionA implements Aircondition_{
    public AirconditionA() {
        System.out.println("制造-->AirconditionA");
    }

    @Override
    public void make() {
        System.out.println("开始制造空调A");
    }
}
