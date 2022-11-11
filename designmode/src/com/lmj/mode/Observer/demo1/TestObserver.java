package com.lmj.mode.Observer.demo1;

public class TestObserver implements Observer{
    @Override
    public void update(NumberGenerator generator) {
        if (generator.getNumber() % 3 == 0){
            System.out.println("TestObserver:" + generator.getNumber());
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
