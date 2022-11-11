package com.lmj.mode.AbstractFactory.demo1.plant;


import com.lmj.mode.AbstractFactory.demo1.product.AirconditionA;
import com.lmj.mode.AbstractFactory.demo1.product.Aircondition_;
import com.lmj.mode.AbstractFactory.demo1.product.EngineA;
import com.lmj.mode.AbstractFactory.demo1.product.Engine_;

//宝马320系列
public class FactoryBMW320 implements AbstractFactory{
    @Override
    public Engine_ createEngine() {
        return new EngineA();
    }

    @Override
    public Aircondition_ createAircondition() {
        return new AirconditionA();
    }
}