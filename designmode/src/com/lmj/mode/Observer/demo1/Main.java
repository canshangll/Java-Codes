package com.lmj.mode.Observer.demo1;

public class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new IncrementalNumberGenerator(0,50,5);
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        Observer observer3 = new TestObserver();
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.addObserver(observer3);
        generator.execute();
    }
}
