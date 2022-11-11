package com.lmj.mode.AbstractFactory.demo1.plant;


import com.lmj.mode.AbstractFactory.demo1.product.Aircondition_;
import com.lmj.mode.AbstractFactory.demo1.product.Engine_;

public interface AbstractFactory {
    //制造发动机
    Engine_ createEngine();
    //制造空调
    Aircondition_ createAircondition();
}

