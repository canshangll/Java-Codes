package com.lmj.mode.Visitor.demo1;

public abstract class Action {
    //得到男性的测评结果
    public abstract void getManResult(Man man);
    //得到女的测评
    public abstract void getWomanResult(Woman woman);
}
