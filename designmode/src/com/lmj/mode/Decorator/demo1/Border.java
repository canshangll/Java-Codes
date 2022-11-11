package com.lmj.mode.Decorator.demo1;

public abstract class Border extends Display {
    protected Display display; //表示被装饰物
    protected Border(Display display){ //生成实例时通过参数指定被装饰物
        this.display = display;
    }
}
