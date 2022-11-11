package com.lmj.mode.Chain_of_Responsibility;

//解决奇数编号的问题
public class oddSupport extends Support {
    public oddSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}
