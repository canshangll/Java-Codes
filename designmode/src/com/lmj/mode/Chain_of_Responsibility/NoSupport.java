package com.lmj.mode.Chain_of_Responsibility;

//一个永远不解决问题的类
public class NoSupport extends Support {
    public NoSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {//解决问题的方法
        return false;//自己什么也不处理。
    }
}
