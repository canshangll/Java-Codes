package com.lmj.mode.Visitor.demo1;

public class Woman extends Person {
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
