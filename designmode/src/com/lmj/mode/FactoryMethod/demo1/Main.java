package com.lmj.mode.FactoryMethod.demo1;

import com.lmj.mode.FactoryMethod.demo1.framework.Factory;
import com.lmj.mode.FactoryMethod.demo1.framework.Product;
import com.lmj.mode.FactoryMethod.demo1.idcard.IDCard;
import com.lmj.mode.FactoryMethod.demo1.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("小c");
        Product card2 = factory.create("小b");
        Product card3 = factory.create("小a");
        card1.use();
        card2.use();
        card3.use();
    }
}
