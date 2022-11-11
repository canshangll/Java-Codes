package com.lmj.mode.AbstractFactory.demo1.plant;


import com.lmj.mode.AbstractFactory.demo1.product.AirconditionB;
import com.lmj.mode.AbstractFactory.demo1.product.Aircondition_;
import com.lmj.mode.AbstractFactory.demo1.product.EngineB;
import com.lmj.mode.AbstractFactory.demo1.product.Engine_;

//宝马523系列
public class FactoryBMW523 implements AbstractFactory{
    @Override
    public Engine_ createEngine() {
        return new EngineB();
    }

    @Override
    public Aircondition_ createAircondition() {
        return new AirconditionB();
    }
}
