package com.lmj.mode.Bridge.demo1;

public class Main {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello,China"));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello,World"));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello,ZHongShan"));
        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);
        System.out.println("=======");
        RandomCountDisplay d = new RandomCountDisplay(new StringDisplayImpl("Hello,Man"));
        d.randomDisplay(10);
        System.out.println("=======");
        IncreaseDisplay In1 = new IncreaseDisplay(new CharDisplayImpl('<', '*', '>'), 1);
        IncreaseDisplay In2 = new IncreaseDisplay(new CharDisplayImpl('|', '#', '-'), 2);
        In1.increaseDisplay(4);
        In2.increaseDisplay(6);
    }
}
