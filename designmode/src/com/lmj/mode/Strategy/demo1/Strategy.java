package com.lmj.mode.Strategy.demo1;

public interface Strategy {
    public abstract Hand nextHand();
    public abstract void study(boolean win);
}
