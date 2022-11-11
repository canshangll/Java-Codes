package com.lmj.mode.Prototype.demo1.framework;

//复制功能的接口
public interface Product extends Cloneable{
    public abstract void use(String s);
    public abstract Product createClone();
}
