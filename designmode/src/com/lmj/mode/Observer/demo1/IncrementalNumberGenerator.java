package com.lmj.mode.Observer.demo1;

public class IncrementalNumberGenerator extends NumberGenerator {
    private int number;//当前数值
    private int end;//结束数值
    private int inc;//递增步长

    public IncrementalNumberGenerator(int number, int end, int inc) {
        this.number = number;
        this.end = end;
        this.inc = inc;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        while (number < end) {
            notifyObservers();
            number += inc;
        }
    }
}
